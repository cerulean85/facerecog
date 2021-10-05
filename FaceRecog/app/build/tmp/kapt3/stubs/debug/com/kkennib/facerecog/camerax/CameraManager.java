package com.kkennib.facerecog.camerax;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 K2\u00020\u0001:\u0001KBr\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012K\u0010\n\u001aG\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000b\u00a2\u0006\u0002\u0010\u0014J\u000e\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u0016J\u0006\u0010?\u001a\u00020\u0013J\b\u0010@\u001a\u00020\u0013H\u0002J\u0006\u0010A\u001a\u00020BJ\u0006\u0010C\u001a\u00020BJ\b\u0010D\u001a\u00020EH\u0002J\u001a\u0010F\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020\u0013H\u0002J\u0006\u0010J\u001a\u00020\u0013RS\u0010\n\u001aG\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0010\u00a2\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u000200X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000208X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<\u00a8\u0006L"}, d2 = {"Lcom/kkennib/facerecog/camerax/CameraManager;", "", "context", "Landroid/content/Context;", "finderView", "Landroidx/camera/view/PreviewView;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "graphicOverlay", "Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "action", "Lkotlin/Function3;", "Landroid/media/Image;", "Lkotlin/ParameterName;", "name", "image", "Landroid/graphics/Rect;", "imageRect", "boundingBox", "", "(Landroid/content/Context;Landroidx/camera/view/PreviewView;Landroidx/lifecycle/LifecycleOwner;Lcom/kkennib/facerecog/camerax/GraphicOverlay;Lkotlin/jvm/functions/Function3;)V", "analyzerVisionType", "Lcom/kkennib/facerecog/vision/VisionType;", "camera", "Landroidx/camera/core/Camera;", "cameraExecutor", "Ljava/util/concurrent/ExecutorService;", "getCameraExecutor", "()Ljava/util/concurrent/ExecutorService;", "setCameraExecutor", "(Ljava/util/concurrent/ExecutorService;)V", "cameraProvider", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "cameraSelectorOption", "", "getCameraSelectorOption", "()I", "setCameraSelectorOption", "(I)V", "imageAnalyzer", "Landroidx/camera/core/ImageAnalysis;", "imageCapture", "Landroidx/camera/core/ImageCapture;", "getImageCapture", "()Landroidx/camera/core/ImageCapture;", "setImageCapture", "(Landroidx/camera/core/ImageCapture;)V", "metrics", "Landroid/util/DisplayMetrics;", "getMetrics", "()Landroid/util/DisplayMetrics;", "setMetrics", "(Landroid/util/DisplayMetrics;)V", "preview", "Landroidx/camera/core/Preview;", "rotation", "", "getRotation", "()F", "setRotation", "(F)V", "changeAnalyzer", "visionType", "changeCameraSelector", "createNewExecutor", "isFrontMode", "", "isHorizontalMode", "selectAnalyzer", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "setCameraConfig", "cameraSelector", "Landroidx/camera/core/CameraSelector;", "setUpPinchToZoom", "startCamera", "Companion", "app_debug"})
public final class CameraManager {
    private final android.content.Context context = null;
    private final androidx.camera.view.PreviewView finderView = null;
    private final androidx.lifecycle.LifecycleOwner lifecycleOwner = null;
    private final com.kkennib.facerecog.camerax.GraphicOverlay graphicOverlay = null;
    private final kotlin.jvm.functions.Function3<android.media.Image, android.graphics.Rect, android.graphics.Rect, kotlin.Unit> action = null;
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
    kotlin.jvm.functions.Function3<? super android.media.Image, ? super android.graphics.Rect, ? super android.graphics.Rect, kotlin.Unit> action) {
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