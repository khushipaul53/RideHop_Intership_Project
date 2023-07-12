// Generated by view binder compiler. Do not edit!
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
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ridehop_intership_project.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RidesItemBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout LLRides;

  @NonNull
  public final ImageView imageview;

  @NonNull
  public final RatingBar rating;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView tvPrice;

  private RidesItemBinding(@NonNull CardView rootView, @NonNull LinearLayout LLRides,
      @NonNull ImageView imageview, @NonNull RatingBar rating, @NonNull TextView textView,
      @NonNull TextView tvPrice) {
    this.rootView = rootView;
    this.LLRides = LLRides;
    this.imageview = imageview;
    this.rating = rating;
    this.textView = textView;
    this.tvPrice = tvPrice;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static RidesItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RidesItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.rides_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RidesItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.LLRides;
      LinearLayout LLRides = ViewBindings.findChildViewById(rootView, id);
      if (LLRides == null) {
        break missingId;
      }

      id = R.id.imageview;
      ImageView imageview = ViewBindings.findChildViewById(rootView, id);
      if (imageview == null) {
        break missingId;
      }

      id = R.id.rating;
      RatingBar rating = ViewBindings.findChildViewById(rootView, id);
      if (rating == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.tvPrice;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      return new RidesItemBinding((CardView) rootView, LLRides, imageview, rating, textView,
          tvPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
