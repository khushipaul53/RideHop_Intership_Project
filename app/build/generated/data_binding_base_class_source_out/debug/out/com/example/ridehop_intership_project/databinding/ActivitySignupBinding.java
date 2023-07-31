// Generated by data binding compiler. Do not edit!
package com.example.ridehop_intership_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.ridehop_intership_project.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivitySignupBinding extends ViewDataBinding {
  @NonNull
  public final EditText ETConfirmPassword;

  @NonNull
  public final EditText ETPassword;

  @NonNull
  public final TextView TvAge;

  @NonNull
  public final TextView TvConfirmPassword;

  @NonNull
  public final TextView TvEmail;

  @NonNull
  public final TextView TvGender;

  @NonNull
  public final TextView TvName;

  @NonNull
  public final TextView TvPassword;

  @NonNull
  public final AppCompatButton btSignup;

  @NonNull
  public final CheckBox cbTerms;

  @NonNull
  public final EditText etAge;

  @NonNull
  public final EditText etEmail;

  @NonNull
  public final EditText etName;

  @NonNull
  public final RadioButton femaleRadio;

  @NonNull
  public final RadioGroup idRadioGroup;

  @NonNull
  public final RadioButton maleRadio;

  @NonNull
  public final TextView tvSignin;

  protected ActivitySignupBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText ETConfirmPassword, EditText ETPassword, TextView TvAge, TextView TvConfirmPassword,
      TextView TvEmail, TextView TvGender, TextView TvName, TextView TvPassword,
      AppCompatButton btSignup, CheckBox cbTerms, EditText etAge, EditText etEmail, EditText etName,
      RadioButton femaleRadio, RadioGroup idRadioGroup, RadioButton maleRadio, TextView tvSignin) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ETConfirmPassword = ETConfirmPassword;
    this.ETPassword = ETPassword;
    this.TvAge = TvAge;
    this.TvConfirmPassword = TvConfirmPassword;
    this.TvEmail = TvEmail;
    this.TvGender = TvGender;
    this.TvName = TvName;
    this.TvPassword = TvPassword;
    this.btSignup = btSignup;
    this.cbTerms = cbTerms;
    this.etAge = etAge;
    this.etEmail = etEmail;
    this.etName = etName;
    this.femaleRadio = femaleRadio;
    this.idRadioGroup = idRadioGroup;
    this.maleRadio = maleRadio;
    this.tvSignin = tvSignin;
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_signup, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivitySignupBinding>inflateInternal(inflater, R.layout.activity_signup, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_signup, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivitySignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivitySignupBinding>inflateInternal(inflater, R.layout.activity_signup, null, false, component);
  }

  public static ActivitySignupBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivitySignupBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivitySignupBinding)bind(component, view, R.layout.activity_signup);
  }
}
