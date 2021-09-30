package com.kkennib.facerecog.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0015R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, d2 = {"Lcom/kkennib/facerecog/ui/main/MainActivity;", "Lcom/kkennib/facerecog/ui/main/BaseActivity;", "()V", "binding", "Lcom/kkennib/facerecog/databinding/ActivityMainBinding;", "getBinding", "()Lcom/kkennib/facerecog/databinding/ActivityMainBinding;", "binding$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/kkennib/facerecog/ui/main/MainViewModel;", "getViewModel", "()Lcom/kkennib/facerecog/ui/main/MainViewModel;", "viewModel$delegate", "initViewModel", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class MainActivity extends com.kkennib.facerecog.ui.main.BaseActivity {
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.ui.main.MainActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String uuid = "";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String galleryPath = "";
    private java.util.HashMap _$_findViewCache;
    
    public MainActivity() {
        super();
    }
    
    private final com.kkennib.facerecog.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    private final com.kkennib.facerecog.ui.main.MainViewModel getViewModel() {
        return null;
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewModel() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/kkennib/facerecog/ui/main/MainActivity$Companion;", "", "()V", "galleryPath", "", "getGalleryPath", "()Ljava/lang/String;", "setGalleryPath", "(Ljava/lang/String;)V", "uuid", "getUuid", "setUuid", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getUuid() {
            return null;
        }
        
        public final void setUuid(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getGalleryPath() {
            return null;
        }
        
        public final void setGalleryPath(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
    }
}