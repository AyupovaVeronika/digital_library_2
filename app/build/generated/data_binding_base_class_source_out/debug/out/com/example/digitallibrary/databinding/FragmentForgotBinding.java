// Generated by view binder compiler. Do not edit!
package com.example.digitallibrary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.example.digitallibrary.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class FragmentForgotBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout forgotPassword;

  private FragmentForgotBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout forgotPassword) {
    this.rootView = rootView;
    this.forgotPassword = forgotPassword;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentForgotBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_forgot, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentForgotBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    ConstraintLayout forgotPassword = (ConstraintLayout) rootView;

    return new FragmentForgotBinding((ConstraintLayout) rootView, forgotPassword);
  }
}
