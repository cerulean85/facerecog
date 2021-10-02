package com.kkennib.facerecog.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\tH\u0002R\u0019\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/kkennib/facerecog/ui/main/RecogViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "onFabButtonEvent", "Landroidx/lifecycle/MutableLiveData;", "", "getOnFabButtonEvent", "()Landroidx/lifecycle/MutableLiveData;", "onItemSelectedEvent", "Lcom/kkennib/facerecog/vision/VisionType;", "getOnItemSelectedEvent", "onShutterButtonEvent", "getOnShutterButtonEvent", "onBottomMenuClicked", "", "item", "Landroid/view/MenuItem;", "onClickFabButton", "view", "Landroid/view/View;", "onClickShutter", "postVisionType", "type", "app_debug"})
public final class RecogViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.kkennib.facerecog.vision.VisionType> onItemSelectedEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> onFabButtonEvent = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<kotlin.Unit> onShutterButtonEvent = null;
    
    public RecogViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.kkennib.facerecog.vision.VisionType> getOnItemSelectedEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getOnFabButtonEvent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<kotlin.Unit> getOnShutterButtonEvent() {
        return null;
    }
    
    public final boolean onBottomMenuClicked(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void onClickFabButton(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void onClickShutter(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void postVisionType(com.kkennib.facerecog.vision.VisionType type) {
    }
}