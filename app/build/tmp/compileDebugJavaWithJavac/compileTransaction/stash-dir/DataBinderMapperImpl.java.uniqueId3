package com.example.expensetrackerv1;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.expensetrackerv1.databinding.ActivityHomeBindingImpl;
import com.example.expensetrackerv1.databinding.FragmentDashboardBindingImpl;
import com.example.expensetrackerv1.databinding.FragmentNewRecordBindingImpl;
import com.example.expensetrackerv1.databinding.FragmentViewRecordBindingImpl;
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
  private static final int LAYOUT_ACTIVITYHOME = 1;

  private static final int LAYOUT_FRAGMENTDASHBOARD = 2;

  private static final int LAYOUT_FRAGMENTNEWRECORD = 3;

  private static final int LAYOUT_FRAGMENTVIEWRECORD = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.expensetrackerv1.R.layout.activity_home, LAYOUT_ACTIVITYHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.expensetrackerv1.R.layout.fragment_dashboard, LAYOUT_FRAGMENTDASHBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.expensetrackerv1.R.layout.fragment_new_record, LAYOUT_FRAGMENTNEWRECORD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.expensetrackerv1.R.layout.fragment_view_record, LAYOUT_FRAGMENTVIEWRECORD);
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
        case  LAYOUT_ACTIVITYHOME: {
          if ("layout/activity_home_0".equals(tag)) {
            return new ActivityHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDASHBOARD: {
          if ("layout/fragment_dashboard_0".equals(tag)) {
            return new FragmentDashboardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_dashboard is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTNEWRECORD: {
          if ("layout/fragment_new_record_0".equals(tag)) {
            return new FragmentNewRecordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_new_record is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIEWRECORD: {
          if ("layout/fragment_view_record_0".equals(tag)) {
            return new FragmentViewRecordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_view_record is invalid. Received: " + tag);
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
      sKeys.put(1, "viewModel");
      sKeys.put(2, "viewmodel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_home_0", com.example.expensetrackerv1.R.layout.activity_home);
      sKeys.put("layout/fragment_dashboard_0", com.example.expensetrackerv1.R.layout.fragment_dashboard);
      sKeys.put("layout/fragment_new_record_0", com.example.expensetrackerv1.R.layout.fragment_new_record);
      sKeys.put("layout/fragment_view_record_0", com.example.expensetrackerv1.R.layout.fragment_view_record);
    }
  }
}
