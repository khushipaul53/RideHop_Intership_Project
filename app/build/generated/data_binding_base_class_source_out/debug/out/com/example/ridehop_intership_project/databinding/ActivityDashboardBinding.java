// Generated by data binding compiler. Do not edit!
package com.example.ridehop_intership_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.drawerlayout.widget.DrawerLayout;
import com.example.ridehop_intership_project.R;
import com.google.android.material.navigation.NavigationView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityDashboardBinding extends ViewDataBinding {
  @NonNull
  public final AppBarNavigationBinding appBarNavigation;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final NavigationView navView;

  protected ActivityDashboardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarNavigationBinding appBarNavigation, DrawerLayout drawerLayout, NavigationView navView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarNavigation = appBarNavigation;
    this.drawerLayout = drawerLayout;
    this.navView = navView;
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_dashboard, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityDashboardBinding>inflateInternal(inflater, R.layout.activity_dashboard, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_dashboard, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityDashboardBinding>inflateInternal(inflater, R.layout.activity_dashboard, null, false, component);
  }

  public static ActivityDashboardBinding bind(@NonNull View view) {
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
  public static ActivityDashboardBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityDashboardBinding)bind(component, view, R.layout.activity_dashboard);
  }
}
