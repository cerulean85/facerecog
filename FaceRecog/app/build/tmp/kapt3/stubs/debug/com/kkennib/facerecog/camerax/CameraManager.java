package com.kkennib.facerecog.camerax;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 D2\u00020\u0001:\u0001DB3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\u0002\u0010\rJ\u000e\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\u000fJ\u0006\u00108\u001a\u00020\fJ\b\u00109\u001a\u00020\fH\u0002J\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u00020;J\b\u0010=\u001a\u00020>H\u0002J\u001a\u0010?\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010@\u001a\u00020AH\u0002J\b\u0010B\u001a\u00020\fH\u0002J\u0006\u0010C\u001a\u00020\fR\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u00020#X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020)X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00100\u001a\u000201X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u00a8\u0006E"}, d2 = {"Lcom/kkennib/facerecog/camerax/CameraManager;", "", "context", "Landroid/content/Context;", "finderView", "Landroidx/camera/view/PreviewView;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "graphicOverlay", "Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "action", "Lkotlin/Function0;", "", "(Landroid/content/Context;Landroidx/camera/view/PreviewView;Landroidx/lifecycle/LifecycleOwner;Lcom/kkennib/facerecog/camerax/GraphicOverlay;Lkotlin/jvm/functions/Function0;)V", "analyzerVisionType", "Lcom/kkennib/facerecog/vision/VisionType;", "camera", "Landroidx/camera/core/Camera;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "getCameraExecutor", "()Ljava/util/concurrent/ExecutorService;", "setCameraExecutor", "(Ljava/util/concurrent/ExecutorService;)V", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraSelectorOption", "", "getCameraSelectorOption", "()I", "setCameraSelectorOption", "(I)V", "imageAnalyzer", "Landroidx/camera/core/ImageAnalysis;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "getImageCapture", "()Landroidx/camera/core/ImageCapture;", "setImageCapture", "(Landroidx/camera/core/ImageCapture;)V", "metrics", "Landroid/util/DisplayMetrics;", "getMetrics", "()Landroid/util/DisplayMetrics;", "setMetrics", "(Landroid/util/DisplayMetrics;)V", "preview", "Landroidx/camera/core/Preview;", "rotation", "", "getRotation", "()F", "setRotation", "(F)V", "changeAnalyzer", "visionType", "changeCameraSelector", "createNewExecutor", "isFrontMode", "", "isHorizontalMode", "selectAnalyzer", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "setCameraConfig", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "setUpPinchToZoom", "startCamera", "Companion", "app_debug"})
public final class CameraManager {
    private final android.content.Context context = null;
    private final androidx.camera.view.PreviewView finderView = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    private final com.kkennib.facerecog.camerax.GraphicOverlay graphicOverlay = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> action = null;
    private androidx.camera.core.Preview preview;
    private androidx.camera.core.Camera camera;
    private androidx.camera.lifecycle.ProcessCameraProvider cameraProvider;
    private androidx.camera.core.ImageAnalysis imageAnalyzer;
    private com.kkennib.facerecog.vision.VisionType analyzerVisionType = com.kkennib.facerecog.vision.VisionType.Face;
    public java.util.concurrent.ExecutorService cameraExecutor;
    public androidx.camera.core.ImageCapture imageCapture;
    public android.util.DisplayMetrics metrics;
    private float rotation = 0.0F;
    private int cameraSelectorOption = androidx.camera.core.CameraSelector.LENS_FACING_BACK;
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.camerax.CameraManager.Companion Companion = null;
    private static final double RATIO_4_3_VALUE = 1.3333333333333333;
    private static final double RATIO_16_9_VALUE = 1.7777777777777777;
    private static final java.lang.String TAG = "CameraXBasic";
    
    public CameraManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    androidx.camera.view.PreviewView finderView, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay graphicOverlay, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ExecutorService getCameraExecutor() {
        return null;
    }
    
    public final void setCameraExecutor(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ExecutorService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.camera.core.ImageCapture getImageCapture() {
        return null;
    }
    
    public final void setImageCapture(@org.jetbrains.annotations.NotNull()
    androidx.camera.core.ImageCapture p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.util.DisplayMetrics getMetrics() {
        return null;
    }
    
    public final void setMetrics(@org.jetbrains.annotations.NotNull()
    android.util.DisplayMetrics p0) {
    }
    
    public final float getRotation() {
        return 0.0F;
    }
    
    public final void setRotation(float p0) {
    }
    
    public final int getCameraSelectorOption() {
        return 0;
    }
    
    public final void setCameraSelectorOption(int p0) {
    }
    
    private final void createNewExecutor() {
    }
    
    private final androidx.camera.core.ImageAnalysis.Analyzer selectAnalyzer() {
        return null;
    }
    
    private final void setCameraConfig(androidx.camera.lifecycle.ProcessCameraProvider cameraProvider, androidx.camera.core.CameraSelector cameraSelector) {
    }
    
    private final void setUpPinchToZoom() {
    }
    
    public final void startCamera() {
    }
    
    public final void changeCameraSelector() {
    }
    
    public final void changeAnalyzer(@org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.vision.VisionType visionType) {
    }
    
    public final boolean isHorizontalMode() {
        return false;
    }
    
    public final boolean isFrontMode() {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/kkennib/facerecog/camerax/CameraManager$Companion;", "", "()V", "RATIO_16_9_VALUE", "", "RATIO_4_3_VALUE", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}