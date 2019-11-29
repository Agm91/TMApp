// Generated by data binding compiler. Do not edit!
package com.agm91.tmapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.agm91.tmapp.R;
import com.agm91.tmapp.model.Account;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentAccountBinding extends ViewDataBinding {
  @NonNull
  public final TextView balance;

  @NonNull
  public final TextView balance1;

  @NonNull
  public final ConstraintLayout constraint;

  @NonNull
  public final TextView iban;

  @NonNull
  public final TextView iban1;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView name1;

  @Bindable
  protected Account mAccount;

  protected FragmentAccountBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TextView balance, TextView balance1, ConstraintLayout constraint, TextView iban,
      TextView iban1, TextView name, TextView name1) {
    super(_bindingComponent, _root, _localFieldCount);
    this.balance = balance;
    this.balance1 = balance1;
    this.constraint = constraint;
    this.iban = iban;
    this.iban1 = iban1;
    this.name = name;
    this.name1 = name1;
  }

  public abstract void setAccount(@Nullable Account account);

  @Nullable
  public Account getAccount() {
    return mAccount;
  }

  @NonNull
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_account, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentAccountBinding>inflateInternal(inflater, R.layout.fragment_account, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_account, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentAccountBinding>inflateInternal(inflater, R.layout.fragment_account, null, false, component);
  }

  public static FragmentAccountBinding bind(@NonNull View view) {
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
  public static FragmentAccountBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentAccountBinding)bind(component, view, R.layout.fragment_account);
  }
}