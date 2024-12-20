// Generated by view binder compiler. Do not edit!
package com.example.digitallibrary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.digitallibrary.R;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentVhodBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final TextInputEditText emailVhodText;

  @NonNull
  public final TextInputEditText passwordVhodText;

  @NonNull
  public final Button toForgotPassword;

  @NonNull
  public final Button toRegisterButton;

  @NonNull
  public final Button vhodButton;

  private FragmentVhodBinding(@NonNull ScrollView rootView,
      @NonNull TextInputEditText emailVhodText, @NonNull TextInputEditText passwordVhodText,
      @NonNull Button toForgotPassword, @NonNull Button toRegisterButton,
      @NonNull Button vhodButton) {
    this.rootView = rootView;
    this.emailVhodText = emailVhodText;
    this.passwordVhodText = passwordVhodText;
    this.toForgotPassword = toForgotPassword;
    this.toRegisterButton = toRegisterButton;
    this.vhodButton = vhodButton;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentVhodBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentVhodBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_vhod, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentVhodBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emailVhodText;
      TextInputEditText emailVhodText = ViewBindings.findChildViewById(rootView, id);
      if (emailVhodText == null) {
        break missingId;
      }

      id = R.id.passwordVhodText;
      TextInputEditText passwordVhodText = ViewBindings.findChildViewById(rootView, id);
      if (passwordVhodText == null) {
        break missingId;
      }

      id = R.id.to_forgot_password;
      Button toForgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (toForgotPassword == null) {
        break missingId;
      }

      id = R.id.to_register_button;
      Button toRegisterButton = ViewBindings.findChildViewById(rootView, id);
      if (toRegisterButton == null) {
        break missingId;
      }

      id = R.id.vhod_button;
      Button vhodButton = ViewBindings.findChildViewById(rootView, id);
      if (vhodButton == null) {
        break missingId;
      }

      return new FragmentVhodBinding((ScrollView) rootView, emailVhodText, passwordVhodText,
          toForgotPassword, toRegisterButton, vhodButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
