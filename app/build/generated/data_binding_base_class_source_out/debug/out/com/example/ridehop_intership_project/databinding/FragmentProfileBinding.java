// Generated by data binding compiler. Do not edit!
package com.example.ridehop_intership_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.ridehop_intership_project.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentProfileBinding extends ViewDataBinding {
  @NonNull
  public final TextView TvCartype;

  @NonNull
  public final TextView TvEmail;

  @NonNull
  public final TextView TvName;

  @NonNull
  public final TextView TvPhone;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final AppCompatButton btEdit;

  @NonNull
  public final ImageButton icBack;

  @NonNull
  public final RelativeLayout rlLayout;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvHeading;

  protected FragmentProfileBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView TvCartype, TextView TvEmail, TextView TvName, TextView TvPhone, AppBarLayout appbar,
      AppCompatButton btEdit, ImageButton icBack, RelativeLayout rlLayout, Toolbar toolbar,
      TextView tvHeading) {
    super(_bindingComponent, _root, _localFieldCount);
    this.TvCartype = TvCartype;
    this.TvEmail = TvEmail;
    this.TvName = TvName;
    this.TvPhone = TvPhone;
    this.appbar = appbar;
    this.btEdit = btEdit;
    this.icBack = icBack;
    this.rlLayout = rlLayout;
    this.toolbar = toolbar;
    this.tvHeading = tvHeading;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileBinding>inflateInternal(inflater, R.layout.fragment_profile, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_profile, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentProfileBinding>inflateInternal(inflater, R.layout.fragment_profile, null, false, component);
  }

  public static FragmentProfileBinding bind(@NonNull View view) {
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
  public static FragmentProfileBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentProfileBinding)bind(component, view, R.layout.fragment_profile);
  }
}