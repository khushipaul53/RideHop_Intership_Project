package com.example.ridehop_intership_project;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.ridehop_intership_project.databinding.ActivityDashboardBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivityLoginBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivityMyRidesBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivityRiderDetailsBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivitySearchRidesBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivitySignupBindingImpl;
import com.example.ridehop_intership_project.databinding.ActivitySplashBindingImpl;
import com.example.ridehop_intership_project.databinding.FragmentBookedRidesBindingImpl;
import com.example.ridehop_intership_project.databinding.FragmentDashboardBindingImpl;
import com.example.ridehop_intership_project.databinding.FragmentOfferedRidesBindingImpl;
import com.example.ridehop_intership_project.databinding.FragmentProfileBindingImpl;
import com.example.ridehop_intership_project.databinding.FragmentPromocodeBindingImpl;
import com.example.ridehop_intership_project.databinding.FragmentRewardsBindingImpl;
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

  private static final int LAYOUT_ACTIVITYMYRIDES = 3;

  private static final int LAYOUT_ACTIVITYRIDERDETAILS = 4;

  private static final int LAYOUT_ACTIVITYSEARCHRIDES = 5;

  private static final int LAYOUT_ACTIVITYSIGNUP = 6;

  private static final int LAYOUT_ACTIVITYSPLASH = 7;

  private static final int LAYOUT_FRAGMENTBOOKEDRIDES = 8;

  private static final int LAYOUT_FRAGMENTDASHBOARD = 9;

  private static final int LAYOUT_FRAGMENTOFFEREDRIDES = 10;

  private static final int LAYOUT_FRAGMENTPROFILE = 11;

  private static final int LAYOUT_FRAGMENTPROMOCODE = 12;

  private static final int LAYOUT_FRAGMENTREWARDS = 13;

  private static final int LAYOUT_NAVIGATIONLAYOUT = 14;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(14);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_dashboard, LAYOUT_ACTIVITYDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_my_rides, LAYOUT_ACTIVITYMYRIDES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_rider_details, LAYOUT_ACTIVITYRIDERDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_search_rides, LAYOUT_ACTIVITYSEARCHRIDES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_signup, LAYOUT_ACTIVITYSIGNUP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.fragment_booked_rides, LAYOUT_FRAGMENTBOOKEDRIDES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.fragment_dashboard, LAYOUT_FRAGMENTDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.fragment_offered_rides, LAYOUT_FRAGMENTOFFEREDRIDES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.fragment_promocode, LAYOUT_FRAGMENTPROMOCODE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.ridehop_intership_project.R.layout.fragment_rewards, LAYOUT_FRAGMENTREWARDS);
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
        case  LAYOUT_ACTIVITYMYRIDES: {
          if ("layout/activity_my_rides_0".equals(tag)) {
            return new ActivityMyRidesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_my_rides is invalid. Received: " + tag);
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
        case  LAYOUT_FRAGMENTBOOKEDRIDES: {
          if ("layout/fragment_booked_rides_0".equals(tag)) {
            return new FragmentBookedRidesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_booked_rides is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDASHBOARD: {
          if ("layout/fragment_dashboard_0".equals(tag)) {
            return new FragmentDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTOFFEREDRIDES: {
          if ("layout/fragment_offered_rides_0".equals(tag)) {
            return new FragmentOfferedRidesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_offered_rides is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROMOCODE: {
          if ("layout/fragment_promocode_0".equals(tag)) {
            return new FragmentPromocodeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_promocode is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREWARDS: {
          if ("layout/fragment_rewards_0".equals(tag)) {
            return new FragmentRewardsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_rewards is invalid. Received: " + tag);
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
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(14);

    static {
      sKeys.put("layout/activity_dashboard_0", com.example.ridehop_intership_project.R.layout.activity_dashboard);
      sKeys.put("layout/activity_login_0", com.example.ridehop_intership_project.R.layout.activity_login);
      sKeys.put("layout/activity_my_rides_0", com.example.ridehop_intership_project.R.layout.activity_my_rides);
      sKeys.put("layout/activity_rider_details_0", com.example.ridehop_intership_project.R.layout.activity_rider_details);
      sKeys.put("layout/activity_search_rides_0", com.example.ridehop_intership_project.R.layout.activity_search_rides);
      sKeys.put("layout/activity_signup_0", com.example.ridehop_intership_project.R.layout.activity_signup);
      sKeys.put("layout/activity_splash_0", com.example.ridehop_intership_project.R.layout.activity_splash);
      sKeys.put("layout/fragment_booked_rides_0", com.example.ridehop_intership_project.R.layout.fragment_booked_rides);
      sKeys.put("layout/fragment_dashboard_0", com.example.ridehop_intership_project.R.layout.fragment_dashboard);
      sKeys.put("layout/fragment_offered_rides_0", com.example.ridehop_intership_project.R.layout.fragment_offered_rides);
      sKeys.put("layout/fragment_profile_0", com.example.ridehop_intership_project.R.layout.fragment_profile);
      sKeys.put("layout/fragment_promocode_0", com.example.ridehop_intership_project.R.layout.fragment_promocode);
      sKeys.put("layout/fragment_rewards_0", com.example.ridehop_intership_project.R.layout.fragment_rewards);
      sKeys.put("layout/navigation_layout_0", com.example.ridehop_intership_project.R.layout.navigation_layout);
    }
  }
}
