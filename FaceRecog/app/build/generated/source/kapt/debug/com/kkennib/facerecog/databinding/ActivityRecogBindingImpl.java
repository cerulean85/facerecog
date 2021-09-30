package com.kkennib.facerecog.databinding;
import com.kkennib.facerecog.R;
import com.kkennib.facerecog.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityRecogBindingImpl extends ActivityRecogBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.previewView_finder, 4);
        sViewsWithIds.put(R.id.graphicOverlay_finder, 5);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mViewModelOnClickShutterAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mViewModelOnClickFabButtonAndroidViewViewOnClickListener;
    private OnNavigationItemSelectedListenerImpl mViewModelOnBottomMenuClickedComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener;
    // Inverse Binding Event Handlers

    public ActivityRecogBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityRecogBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.kkennib.facerecog.ui.component.FabBottomNavigationView) bindings[1]
            , (com.google.android.material.floatingactionbutton.FloatingActionButton) bindings[2]
            , (com.kkennib.facerecog.camerax.GraphicOverlay) bindings[5]
            , (android.widget.ImageButton) bindings[3]
            , (androidx.camera.view.PreviewView) bindings[4]
            );
        this.bottomNavigationViewFinder.setTag(null);
        this.fabFinder.setTag(null);
        this.imageButtonShutter.setTag(null);
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
            setViewModel((com.kkennib.facerecog.ui.main.RecogViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.kkennib.facerecog.ui.main.RecogViewModel ViewModel) {
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
        android.view.View.OnClickListener viewModelOnClickShutterAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener viewModelOnClickFabButtonAndroidViewViewOnClickListener = null;
        com.kkennib.facerecog.ui.main.RecogViewModel viewModel = mViewModel;
        com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener viewModelOnBottomMenuClickedComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (viewModel != null) {
                    // read viewModel::onClickShutter
                    viewModelOnClickShutterAndroidViewViewOnClickListener = (((mViewModelOnClickShutterAndroidViewViewOnClickListener == null) ? (mViewModelOnClickShutterAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mViewModelOnClickShutterAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::onClickFabButton
                    viewModelOnClickFabButtonAndroidViewViewOnClickListener = (((mViewModelOnClickFabButtonAndroidViewViewOnClickListener == null) ? (mViewModelOnClickFabButtonAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mViewModelOnClickFabButtonAndroidViewViewOnClickListener).setValue(viewModel));
                    // read viewModel::onBottomMenuClicked
                    viewModelOnBottomMenuClickedComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener = (((mViewModelOnBottomMenuClickedComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener == null) ? (mViewModelOnBottomMenuClickedComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener = new OnNavigationItemSelectedListenerImpl()) : mViewModelOnBottomMenuClickedComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener).setValue(viewModel));
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.kkennib.facerecog.util.BindingAdapterKt.setOnNavigationItemSelectedListener(this.bottomNavigationViewFinder, viewModelOnBottomMenuClickedComGoogleAndroidMaterialBottomnavigationBottomNavigationViewOnNavigationItemSelectedListener);
            com.kkennib.facerecog.util.BindingAdapterKt.setOnFabButtonClickListener(this.fabFinder, viewModelOnClickFabButtonAndroidViewViewOnClickListener);
            this.imageButtonShutter.setOnClickListener(viewModelOnClickShutterAndroidViewViewOnClickListener);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.kkennib.facerecog.ui.main.RecogViewModel value;
        public OnClickListenerImpl setValue(com.kkennib.facerecog.ui.main.RecogViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickShutter(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.kkennib.facerecog.ui.main.RecogViewModel value;
        public OnClickListenerImpl1 setValue(com.kkennib.facerecog.ui.main.RecogViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickFabButton(arg0); 
        }
    }
    public static class OnNavigationItemSelectedListenerImpl implements com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener{
        private com.kkennib.facerecog.ui.main.RecogViewModel value;
        public OnNavigationItemSelectedListenerImpl setValue(com.kkennib.facerecog.ui.main.RecogViewModel value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public boolean onNavigationItemSelected(android.view.MenuItem arg0) {
            return this.value.onBottomMenuClicked(arg0); 
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