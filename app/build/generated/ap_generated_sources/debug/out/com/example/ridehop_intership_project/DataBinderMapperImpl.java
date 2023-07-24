package com.example.ridehop_intership_project;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.ridehop_intership_project.databinding.ActivityDashboardBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivityLoginBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivityRiderDetailsBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivitySearchRidesBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivitySignupBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivitySplashBindingImpl;
import com.example.ridehop_intership_project.databinding.FragmentDashboardBindingImpl;
import com.example.ridehop_intership_project.databinding.NavigationLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDASHBOARD = 1;

  private static final int LAYOUT_ACTIVITYLOGIN = 2;

  private static final int LAYOUT_ACTIVITYRIDERDETAILS = 3;

  private static final int LAYOUT_ACTIVITYSEARCHRIDES = 4;

  private static final int LAYOUT_ACTIVITYSIGNUP = 5;

  private static final int LAYOUT_ACTIVITYSPLASH = 6;

  private static final int LAYOUT_FRAGMENTDASHBOARD = 7;

  private static final int LAYOUT_NAVIGATIONLAYOUT = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_dashboard, LAYOUT_ACTIVITYDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_rider_details, LAYOUT_ACTIVITYRIDERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_search_rides, LAYOUT_ACTIVITYSEARCHRIDES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_signup, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.fragment_dashboard, LAYOUT_FRAGMENTDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.navigation_layout, LAYOUT_NAVIGATIONLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDASHBOARD: {
          if ("layout/activity_dashboard_0".equals(tag)) {
            return new ActivityDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRIDERDETAILS: {
          if ("layout/activity_rider_details_0".equals(tag)) {
            return new ActivityRiderDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_rider_details is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSEARCHRIDES: {
          if ("layout/activity_search_rides_0".equals(tag)) {
            return new ActivitySearchRidesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_search_rides is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSIGNUP: {
          if ("layout/activity_signup_0".equals(tag)) {
            return new ActivitySignupBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_signup is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDASHBOARD: {
          if ("layout/fragment_dashboard_0".equals(tag)) {
            return new FragmentDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_NAVIGATIONLAYOUT: {
          if ("layout/navigation_layout_0".equals(tag)) {
            return new NavigationLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for navigation_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_dashboard_0", com.example.ridehop_intership_project.R.layout.activity_dashboard);
      sKeys.put("layout/activity_login_0", com.example.ridehop_intership_project.R.layout.activity_login);
      sKeys.put("layout/activity_rider_details_0", com.example.ridehop_intership_project.R.layout.activity_rider_details);
      sKeys.put("layout/activity_search_rides_0", com.example.ridehop_intership_project.R.layout.activity_search_rides);
      sKeys.put("layout/activity_signup_0", com.example.ridehop_intership_project.R.layout.activity_signup);
      sKeys.put("layout/activity_splash_0", com.example.ridehop_intership_project.R.layout.activity_splash);
      sKeys.put("layout/fragment_dashboard_0", com.example.ridehop_intership_project.R.layout.fragment_dashboard);
      sKeys.put("layout/navigation_layout_0", com.example.ridehop_intership_project.R.layout.navigation_layout);
    }
  }
}
