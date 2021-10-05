package com.kkennib.facerecog.databinding;
import com.kkennib.facerecog.R;
import com.kkennib.facerecog.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRealtimeRecogBindingImpl extends ActivityRealtimeRecogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.frame_layout, 2);
        sViewsWithIds.put(R.id.previewView_finder, 3);
        sViewsWithIds.put(R.id.graphicOverlay_finder, 4);
        sViewsWithIds.put(R.id.iv_enrolled_user, 5);
        sViewsWithIds.put(R.id.tvlb, 6);
        sViewsWithIds.put(R.id.tv_similarity, 7);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnClickFabButtonAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityRealtimeRecogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityRealtimeRecogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[1]
            , (android.widget.FrameLayout) bindings[2]
            , (com.kkennib.facerecog.camerax.GraphicOverlay) bindings[4]
            , (android.widget.ImageView) bindings[5]
            , (androidx.camera.view.PreviewView) bindings[3]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            );
        this.fabFinder.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.kkennib.facerecog.ui.main.RealtimeRecogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.kkennib.facerecog.ui.main.RealtimeRecogViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        android.view.View.OnClickListener viewModelOnClickFabButtonAndroidViewViewOnClickListener = null;
        com.kkennib.facerecog.ui.main.RealtimeRecogViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::onClickFabButton
                    viewModelOnClickFabButtonAndroidViewViewOnClickListener = (((mViewModelOnClickFabButtonAndroidViewViewOnClickListener == null) ? (mViewModelOnClickFabButtonAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnClickFabButtonAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.kkennib.facerecog.util.BindingAdapterKt.setOnFabButtonClickListener(this.fabFinder, viewModelOnClickFabButtonAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.kkennib.facerecog.ui.main.RealtimeRecogViewModel value;
        public OnClickListenerImpl setValue(com.kkennib.facerecog.ui.main.RealtimeRecogViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickFabButton(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}