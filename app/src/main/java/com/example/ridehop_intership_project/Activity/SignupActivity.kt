package com.example.ridehop_intership_project.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.ridehop_intership_project.R
import com.example.ridehop_intership_project.Response.LoginResponse
import com.example.ridehop_intership_project.Response.SignupResponse
import com.example.ridehop_intership_project.Retrofit.APIClient
import com.example.ridehop_intership_project.Retrofit.ApiInterface
import com.example.ridehop_intership_project.databinding.ActivitySignupBinding
import com.facebook.CallbackManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.sign

class SignupActivity : AppCompatActivity() {
    var binding:ActivitySignupBinding?=null
    lateinit var apiInterface: ApiInterface
    var callbackManager = CallbackManager.Factory.create()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        apiInterface= APIClient.client!!.create(ApiInterface::class.java).also {
            apiInterface = it
        }
       binding=DataBindingUtil.setContentView(this,R.layout.activity_signup)


        binding!!.tvSignin.setOnClickListener(View.OnClickListener {
           onBackPressed()

        })

        binding!!.btSignup.setOnClickListener(View.OnClickListener {
            if(validatation())
            {
                SignupApi()

            }
        })
    }

    private fun SignupApi() {

        val email: String = binding!!.etEmail.getText().toString()
        val password: String = binding!!.ETPassword.getText().toString()
        var confirmPassword=binding!!.ETConfirmPassword.text.toString()
        var name=binding!!.etName.text.toString()
        var age=binding!!.etAge.text.toString()
        var gender=""
      if(binding!!.maleRadio.isChecked)
      {
          gender="male"
      }
        else{
            gender="female"
      }


        val data: MutableMap<String?, String?> = HashMap()
        data["password"] = password
        data["email"] = email
        data["confirmPassword"] = confirmPassword
        data["gender"]=gender
        data["fullName"] = name
        data["age"]=age
        val call: Call<SignupResponse?>? = apiInterface.signup(data)
        call!!.enqueue(object : Callback<SignupResponse?> {
            override fun onResponse(
                call: Call<SignupResponse?>?,
                response: Response<SignupResponse?>
            ) {

                if(response.isSuccessful)
                {
                    Toast.makeText(this@SignupActivity,response.body()!!.message,Toast.LENGTH_SHORT).show()

                    var signup = Intent(this@SignupActivity,DashboardActivity::class.java)

                    signup.putExtra("data",response.body()!!.user)
                    signup.putExtra("token",response.body()!!.token)
                    signup.putExtra("login",true)
                    signup.putExtra("firstTimeSignup",true)
                    startActivity(signup)
                }



            }

            override fun onFailure(call: Call<SignupResponse?>, t: Throwable) {
                Toast.makeText(this@SignupActivity,t.message,Toast.LENGTH_SHORT).show()

            } //
            //
        })

    }

    private fun validatation(): Boolean {
        var email=binding!!.etEmail.text
        var password=binding!!.ETPassword.text
        var confirmPassword=binding!!.ETConfirmPassword.text
        var name=binding!!.etName.text
        var age=binding!!.etAge.text
        var terms=binding!!.cbTerms.isChecked
        if(email.toString().isEmpty())
        {
            Toast.makeText(this,"Please enter Email", Toast.LENGTH_SHORT).show();
            return false;
        }

        else if(password.toString().isEmpty())

        {
            Toast.makeText(this,"Please enter Password", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(age.toString().isEmpty())

        {
            Toast.makeText(this,"Please enter Age", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(confirmPassword.toString().isEmpty())

        {
            Toast.makeText(this,"Please enter Confirm Password", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(name.toString().isEmpty())

        {
            Toast.makeText(this,"Please enter Name", Toast.LENGTH_SHORT).show();
            return false;
        }
        else if(!terms)

        {
            Toast.makeText(this,"Please check the box for terms and conditions", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;

    }
}

