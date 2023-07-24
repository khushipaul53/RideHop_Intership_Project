// Generated by data binding compiler. Do not edit!
package com.example.ridehop_intership_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.ridehop_intership_project.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRiderDetailsBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout LLCarDetails;

  @NonNull
  public final LinearLayout LLRides;

  @NonNull
  public final AppCompatButton btBook;

  @NonNull
  public final LinearLayout btEmail;

  @NonNull
  public final LinearLayout btcalling;

  @NonNull
  public final ImageView imageview;

  @NonNull
  public final RatingBar rating;

  @NonNull
  public final TextView tvAge;

  @NonNull
  public final TextView tvCarType;

  @NonNull
  public final TextView tvContact;

  @NonNull
  public final TextView tvEmail;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvPhoneNumber;

  @NonNull
  public final TextView tvPrice;

  @NonNull
  public final TextView tvVechicle;

  protected ActivityRiderDetailsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout LLCarDetails, LinearLayout LLRides, AppCompatButton btBook, LinearLayout btEmail,
      LinearLayout btcalling, ImageView imageview, RatingBar rating, TextView tvAge,
      TextView tvCarType, TextView tvContact, TextView tvEmail, TextView tvName,
      TextView tvPhoneNumber, TextView tvPrice, TextView tvVechicle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.LLCarDetails = LLCarDetails;
    this.LLRides = LLRides;
    this.btBook = btBook;
    this.btEmail = btEmail;
    this.btcalling = btcalling;
    this.imageview = imageview;
    this.rating = rating;
    this.tvAge = tvAge;
    this.tvCarType = tvCarType;
    this.tvContact = tvContact;
    this.tvEmail = tvEmail;
    this.tvName = tvName;
    this.tvPhoneNumber = tvPhoneNumber;
    this.tvPrice = tvPrice;
    this.tvVechicle = tvVechicle;
  }

  @NonNull
  public static ActivityRiderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_rider_details, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRiderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRiderDetailsBinding>inflateInternal(inflater, R.layout.activity_rider_details, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRiderDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_rider_details, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRiderDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRiderDetailsBinding>inflateInternal(inflater, R.layout.activity_rider_details, null, false, component);
  }

  public static ActivityRiderDetailsBinding bind(@NonNull View view) {
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
  public static ActivityRiderDetailsBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRiderDetailsBinding)bind(component, view, R.layout.activity_rider_details);
  }
}