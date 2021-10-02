package com.kkennib.facerecog.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\u0012\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J+\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"H\u0016\u00a2\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u0013H\u0002J\b\u0010%\u001a\u00020\u0013H\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\'"}, d2 = {"Lcom/kkennib/facerecog/ui/main/RecogActivity;", "Lcom/kkennib/facerecog/ui/main/BaseActivity;", "()V", "binding", "Lcom/kkennib/facerecog/databinding/ActivityRecogBinding;", "getBinding", "()Lcom/kkennib/facerecog/databinding/ActivityRecogBinding;", "binding$delegate", "Lkotlin/Lazy;", "cameraManager", "Lcom/kkennib/facerecog/camerax/CameraManager;", "viewModel", "Lcom/kkennib/facerecog/ui/main/RecogViewModel;", "getViewModel", "()Lcom/kkennib/facerecog/ui/main/RecogViewModel;", "viewModel$delegate", "allPermissionsGranted", "", "createCameraManager", "", "imageToBitmapSaveGallery", "image", "Landroid/media/Image;", "initViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "setOrientationEvent", "takePicture", "Companion", "app_debug"})
public final class RecogActivity extends com.kkennib.facerecog.ui.main.BaseActivity {
    private final kotlin.Lazy binding$delegate = null;
    private final kotlin.Lazy viewModel$delegate = null;
    private com.kkennib.facerecog.camerax.CameraManager cameraManager;
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.ui.main.RecogActivity.Companion Companion = null;
    public static com.kkennib.facerecog.ui.main.PreferenceUtil prefs;
    private static final int REQUEST_CODE_PERMISSIONS = 10;
    private static final java.lang.String[] REQUIRED_PERMISSIONS = {"android.permission.CAMERA", "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"};
    public static byte[] profileByteArr;
    public static android.graphics.Rect boundingBox;
    private java.util.HashMap _$_findViewCache;
    
    public RecogActivity() {
        super();
    }
    
    private final com.kkennib.facerecog.databinding.ActivityRecogBinding getBinding() {
        return null;
    }
    
    private final com.kkennib.facerecog.ui.main.RecogViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    private final void initViewModel() {
    }
    
    private final void createCameraManager() {
    }
    
    private final void takePicture() {
    }
    
    private final void imageToBitmapSaveGallery(android.media.Image image) {
    }
    
    private final void setOrientationEvent() {
    }
    
    private final boolean allPermissionsGranted() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/kkennib/facerecog/ui/main/RecogActivity$Companion;", "", "()V", "REQUEST_CODE_PERMISSIONS", "", "REQUIRED_PERMISSIONS", "", "", "[Ljava/lang/String;", "boundingBox", "Landroid/graphics/Rect;", "getBoundingBox", "()Landroid/graphics/Rect;", "setBoundingBox", "(Landroid/graphics/Rect;)V", "prefs", "Lcom/kkennib/facerecog/ui/main/PreferenceUtil;", "getPrefs", "()Lcom/kkennib/facerecog/ui/main/PreferenceUtil;", "setPrefs", "(Lcom/kkennib/facerecog/ui/main/PreferenceUtil;)V", "profileByteArr", "", "getProfileByteArr", "()[B", "setProfileByteArr", "([B)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.kkennib.facerecog.ui.main.PreferenceUtil getPrefs() {
            return null;
        }
        
        public final void setPrefs(@org.jetbrains.annotations.NotNull()
        com.kkennib.facerecog.ui.main.PreferenceUtil p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getProfileByteArr() {
            return null;
        }
        
        public final void setProfileByteArr(@org.jetbrains.annotations.NotNull()
        byte[] p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.Rect getBoundingBox() {
            return null;
        }
        
        public final void setBoundingBox(@org.jetbrains.annotations.NotNull()
        android.graphics.Rect p0) {
        }
    }
}