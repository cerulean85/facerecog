package com.kkennib.facerecog;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.kkennib.facerecog.databinding.ActivityEnrolluserBindingImpl;
import com.kkennib.facerecog.databinding.ActivityMainBindingImpl;
import com.kkennib.facerecog.databinding.ActivityRealtimeRecogBindingImpl;
import com.kkennib.facerecog.databinding.ActivityRecogBindingImpl;
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
  private static final int LAYOUT_ACTIVITYENROLLUSER = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYREALTIMERECOG = 3;

  private static final int LAYOUT_ACTIVITYRECOG = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kkennib.facerecog.R.layout.activity_enrolluser, LAYOUT_ACTIVITYENROLLUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kkennib.facerecog.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kkennib.facerecog.R.layout.activity_realtime_recog, LAYOUT_ACTIVITYREALTIMERECOG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.kkennib.facerecog.R.layout.activity_recog, LAYOUT_ACTIVITYRECOG);
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
        case  LAYOUT_ACTIVITYENROLLUSER: {
          if ("layout/activity_enrolluser_0".equals(tag)) {
            return new ActivityEnrolluserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_enrolluser is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREALTIMERECOG: {
          if ("layout/activity_realtime_recog_0".equals(tag)) {
            return new ActivityRealtimeRecogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_realtime_recog is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECOG: {
          if ("layout/activity_recog_0".equals(tag)) {
            return new ActivityRecogBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recog is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_enrolluser_0", com.kkennib.facerecog.R.layout.activity_enrolluser);
      sKeys.put("layout/activity_main_0", com.kkennib.facerecog.R.layout.activity_main);
      sKeys.put("layout/activity_realtime_recog_0", com.kkennib.facerecog.R.layout.activity_realtime_recog);
      sKeys.put("layout/activity_recog_0", com.kkennib.facerecog.R.layout.activity_recog);
    }
  }
}
