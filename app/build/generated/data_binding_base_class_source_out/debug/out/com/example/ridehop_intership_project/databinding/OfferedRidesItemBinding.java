// Generated by view binder compiler. Do not edit!
package com.example.ridehop_intership_project.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ridehop_intership_project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class OfferedRidesItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout LLRides;

  @NonNull
  public final AppCompatButton btLogin;

  @NonNull
  public final TextView tvbooking;

  @NonNull
  public final TextView tvcustomerName;

  @NonNull
  public final TextView tvdate;

  @NonNull
  public final TextView tvdatentime;

  @NonNull
  public final TextView tvfrom;

  @NonNull
  public final TextView tvto;

  private OfferedRidesItemBinding(@NonNull CardView rootView, @NonNull LinearLayout LLRides,
      @NonNull AppCompatButton btLogin, @NonNull TextView tvbooking,
      @NonNull TextView tvcustomerName, @NonNull TextView tvdate, @NonNull TextView tvdatentime,
      @NonNull TextView tvfrom, @NonNull TextView tvto) {
    this.rootView = rootView;
    this.LLRides = LLRides;
    this.btLogin = btLogin;
    this.tvbooking = tvbooking;
    this.tvcustomerName = tvcustomerName;
    this.tvdate = tvdate;
    this.tvdatentime = tvdatentime;
    this.tvfrom = tvfrom;
    this.tvto = tvto;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static OfferedRidesItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OfferedRidesItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.offered_rides_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OfferedRidesItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.LLRides;
      LinearLayout LLRides = ViewBindings.findChildViewById(rootView, id);
      if (LLRides == null) {
        break missingId;
      }

      id = R.id.bt_Login;
      AppCompatButton btLogin = ViewBindings.findChildViewById(rootView, id);
      if (btLogin == null) {
        break missingId;
      }

      id = R.id.tvbooking;
      TextView tvbooking = ViewBindings.findChildViewById(rootView, id);
      if (tvbooking == null) {
        break missingId;
      }

      id = R.id.tvcustomerName;
      TextView tvcustomerName = ViewBindings.findChildViewById(rootView, id);
      if (tvcustomerName == null) {
        break missingId;
      }

      id = R.id.tvdate;
      TextView tvdate = ViewBindings.findChildViewById(rootView, id);
      if (tvdate == null) {
        break missingId;
      }

      id = R.id.tvdatentime;
      TextView tvdatentime = ViewBindings.findChildViewById(rootView, id);
      if (tvdatentime == null) {
        break missingId;
      }

      id = R.id.tvfrom;
      TextView tvfrom = ViewBindings.findChildViewById(rootView, id);
      if (tvfrom == null) {
        break missingId;
      }

      id = R.id.tvto;
      TextView tvto = ViewBindings.findChildViewById(rootView, id);
      if (tvto == null) {
        break missingId;
      }

      return new OfferedRidesItemBinding((CardView) rootView, LLRides, btLogin, tvbooking,
          tvcustomerName, tvdate, tvdatentime, tvfrom, tvto);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
