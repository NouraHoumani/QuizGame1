// Generated by view binder compiler. Do not edit!
package com.techmania.quizgame1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.techmania.quizgame1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoginBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonSignin;

  @NonNull
  public final TextInputEditText editTextLoginEmail;

  @NonNull
  public final TextInputEditText editTextLoginPassword;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextView textViewForgotPassword;

  @NonNull
  public final TextView textViewSignup;

  private ActivityLoginBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonSignin,
      @NonNull TextInputEditText editTextLoginEmail,
      @NonNull TextInputEditText editTextLoginPassword, @NonNull ImageView imageView2,
      @NonNull ConstraintLayout main, @NonNull TextView textViewForgotPassword,
      @NonNull TextView textViewSignup) {
    this.rootView = rootView;
    this.buttonSignin = buttonSignin;
    this.editTextLoginEmail = editTextLoginEmail;
    this.editTextLoginPassword = editTextLoginPassword;
    this.imageView2 = imageView2;
    this.main = main;
    this.textViewForgotPassword = textViewForgotPassword;
    this.textViewSignup = textViewSignup;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonSignin;
      Button buttonSignin = ViewBindings.findChildViewById(rootView, id);
      if (buttonSignin == null) {
        break missingId;
      }

      id = R.id.editTextLoginEmail;
      TextInputEditText editTextLoginEmail = ViewBindings.findChildViewById(rootView, id);
      if (editTextLoginEmail == null) {
        break missingId;
      }

      id = R.id.editTextLoginPassword;
      TextInputEditText editTextLoginPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextLoginPassword == null) {
        break missingId;
      }

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.textViewForgotPassword;
      TextView textViewForgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (textViewForgotPassword == null) {
        break missingId;
      }

      id = R.id.textViewSignup;
      TextView textViewSignup = ViewBindings.findChildViewById(rootView, id);
      if (textViewSignup == null) {
        break missingId;
      }

      return new ActivityLoginBinding((ConstraintLayout) rootView, buttonSignin, editTextLoginEmail,
          editTextLoginPassword, imageView2, main, textViewForgotPassword, textViewSignup);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
