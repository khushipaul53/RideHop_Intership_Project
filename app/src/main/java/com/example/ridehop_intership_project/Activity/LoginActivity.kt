package com.example.ridehop_intership_project.Activity

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.LoginResponse
import com.example.ridehop_intership_project.Retrofit.APIClient.client
import com.example.ridehop_intership_project.Retrofit.ApiInterface
import com.example.ridehop_intership_project.databinding.ActivityLoginBinding
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.Arrays


class LoginActivity : AppCompatActivity() {
       var binding:  ActivityLoginBinding?=null
    private val EMAIL = "email"
     lateinit var apiInterface: ApiInterface

    var callbackManager =CallbackManager.Factory.create()

    private fun validation(): Boolean {

      var email=binding!!.etEmail.text
        var password=binding!!.ETPassword.text
        if(email.toString().isEmpty())
        {
            Toast.makeText(this,"Please enter Email",Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(password.toString().isEmpty())

        {
            Toast.makeText(this,"Please enter Password",Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this, R.layout.activity_login)
        apiInterface= client!!.create(ApiInterface::class.java).also {
            apiInterface = it
        }

        var   gso =  GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build();
       var  mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        val account = GoogleSignIn.getLastSignedInAccount(this)
//        updateUI(account)

        LoginManager.getInstance().registerCallback(callbackManager,object:FacebookCallback<LoginResult> {
            override fun onCancel() {
                TODO("Not yet implemented")
            }

            override fun onError(error: FacebookException) {
                TODO("Not yet implemented")
            }

            override fun onSuccess(result: LoginResult) {
                TODO("Not yet implemented")
            }

        })
        binding!!.btFb.setOnClickListener(View.OnClickListener {
            LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));
        })
        binding!!.btGoogle.setOnClickListener(View.OnClickListener {
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, 1)
        })

        binding!!.btLogin!!.setOnClickListener(View.OnClickListener {
            startActivity(Intent(applicationContext, DashboardActivity::class.java))

        })

        binding!!.TvSignup!!.setOnClickListener(View.OnClickListener {
            startActivity(Intent(applicationContext, SignupActivity::class.java))

        })

        binding!!.TvForgot.setOnClickListener(View.OnClickListener {
            startActivity(Intent(applicationContext, ForgotPassword::class.java))

        })
        binding!!.btLogin.setOnClickListener(View.OnClickListener {
            if(validation())
            {
                LoginAPi()
            }
        })



    }

    private fun LoginAPi() {
        val email: String = binding!!.etEmail.getText().toString()
        val password: String = binding!!.ETPassword.getText().toString()
        val data: MutableMap<String?, String?> = HashMap()
        data["password"] = password
        data["email"] = email
        val call: Call<LoginResponse?>? = apiInterface.login(data)
        call!!.enqueue(object : Callback<LoginResponse?> {
            override fun onResponse(
                call: Call<LoginResponse?>?,
                response: Response<LoginResponse?>) {

                if(response.isSuccessful)
                {



                    Toast.makeText(this@LoginActivity,response.body()!!.message,Toast.LENGTH_SHORT).show()

                    var login = Intent(this@LoginActivity,DashboardActivity::class.java)

                    login.putExtra("token",response.body()!!.token)
                    login.putExtra("login",true)
                    startActivity(login)
                }



            }

            override fun onFailure(call: Call<LoginResponse?>, t: Throwable) {
                Toast.makeText(this@LoginActivity,t.message,Toast.LENGTH_SHORT).show()

            } //
            //
        })
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        callbackManager.onActivityResult(requestCode, resultCode, data)
        super.onActivityResult(requestCode, resultCode, data)


        if (requestCode === 1) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            val task: Task<GoogleSignInAccount> =
                GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)

            // Signed in successfully, show authenticated UI.
//            updateUI(account)
        } catch (e: ApiException) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.w(TAG, "signInResult:failed code=" + e.statusCode)
//            updateUI(null)
        }
    }
}