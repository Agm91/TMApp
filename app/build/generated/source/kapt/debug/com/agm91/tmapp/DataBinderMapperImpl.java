package com.agm91.tmapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.agm91.tmapp.databinding.ActivityMainBindingImpl;
import com.agm91.tmapp.databinding.ActivityShowAccountsBindingImpl;
import com.agm91.tmapp.databinding.FragmentAccountBindingImpl;
import com.agm91.tmapp.databinding.ItemAccountBindingImpl;
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
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYSHOWACCOUNTS = 2;

  private static final int LAYOUT_FRAGMENTACCOUNT = 3;

  private static final int LAYOUT_ITEMACCOUNT = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.agm91.tmapp.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.agm91.tmapp.R.layout.activity_show_accounts, LAYOUT_ACTIVITYSHOWACCOUNTS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.agm91.tmapp.R.layout.fragment_account, LAYOUT_FRAGMENTACCOUNT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.agm91.tmapp.R.layout.item_account, LAYOUT_ITEMACCOUNT);
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
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSHOWACCOUNTS: {
          if ("layout/activity_show_accounts_0".equals(tag)) {
            return new ActivityShowAccountsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_show_accounts is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTACCOUNT: {
          if ("layout/fragment_account_0".equals(tag)) {
            return new FragmentAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_account is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMACCOUNT: {
          if ("layout/item_account_0".equals(tag)) {
            return new ItemAccountBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_account is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "account");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_main_0", com.agm91.tmapp.R.layout.activity_main);
      sKeys.put("layout/activity_show_accounts_0", com.agm91.tmapp.R.layout.activity_show_accounts);
      sKeys.put("layout/fragment_account_0", com.agm91.tmapp.R.layout.fragment_account);
      sKeys.put("layout/item_account_0", com.agm91.tmapp.R.layout.item_account);
    }
  }
}
