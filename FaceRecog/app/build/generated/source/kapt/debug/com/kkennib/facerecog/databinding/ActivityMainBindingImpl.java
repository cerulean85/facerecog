package com.kkennib.facerecog.databinding;
import com.kkennib.facerecog.R;
import com.kkennib.facerecog.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnClickButtonFaceRecogAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelOnClickButtonFaceEnrollAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[1]
            , (android.widget.Button) bindings[2]
            );
        this.btnConfirmInfo.setTag(null);
        this.btnFaceEnroll.setTag(null);
        this.btnFaceRecog.setTag(null);
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
            setViewModel((com.kkennib.facerecog.ui.main.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.kkennib.facerecog.ui.main.MainViewModel ViewModel) {
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
        android.view.View.OnClickListener viewModelOnClickButtonFaceRecogAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelOnClickButtonFaceEnrollAndroidViewViewOnClickListener = null;
        com.kkennib.facerecog.ui.main.MainViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::onClickButtonFaceRecog
                    viewModelOnClickButtonFaceRecogAndroidViewViewOnClickListener = (((mViewModelOnClickButtonFaceRecogAndroidViewViewOnClickListener == null) ? (mViewModelOnClickButtonFaceRecogAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnClickButtonFaceRecogAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::onClickButtonFaceEnroll
                    viewModelOnClickButtonFaceEnrollAndroidViewViewOnClickListener = (((mViewModelOnClickButtonFaceEnrollAndroidViewViewOnClickListener == null) ? (mViewModelOnClickButtonFaceEnrollAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelOnClickButtonFaceEnrollAndroidViewViewOnClickListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.btnConfirmInfo.setOnClickListener(viewModelOnClickButtonFaceRecogAndroidViewViewOnClickListener);
            this.btnFaceEnroll.setOnClickListener(viewModelOnClickButtonFaceEnrollAndroidViewViewOnClickListener);
            this.btnFaceRecog.setOnClickListener(viewModelOnClickButtonFaceRecogAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.kkennib.facerecog.ui.main.MainViewModel value;
        public OnClickListenerImpl setValue(com.kkennib.facerecog.ui.main.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickButtonFaceRecog(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.kkennib.facerecog.ui.main.MainViewModel value;
        public OnClickListenerImpl1 setValue(com.kkennib.facerecog.ui.main.MainViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickButtonFaceEnroll(arg0); 
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