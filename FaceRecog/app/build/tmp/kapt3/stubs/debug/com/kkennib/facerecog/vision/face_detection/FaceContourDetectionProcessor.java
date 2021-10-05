package com.kkennib.facerecog.vision.face_detection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001#BZ\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012K\u0010\u0006\u001aG\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0007\u00a2\u0006\u0002\u0010\u0010J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u001aH\u0014J\u0014\u0010\u001b\u001a\u00020\u000f2\n\u0010\u001c\u001a\u00060\u001dj\u0002`\u001eH\u0014J.\u0010\u001f\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0014J\b\u0010\"\u001a\u00020\u000fH\u0016RS\u0010\u0006\u001aG\u0012\u0013\u0012\u00110\b\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\u000f0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/kkennib/facerecog/vision/face_detection/FaceContourDetectionProcessor;", "Lcom/kkennib/facerecog/camerax/BaseImageAnalyzer;", "", "Lcom/google/mlkit/vision/face/Face;", "view", "Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "action", "Lkotlin/Function3;", "Landroid/media/Image;", "Lkotlin/ParameterName;", "name", "image", "Landroid/graphics/Rect;", "imageRect", "boundingBox", "", "(Lcom/kkennib/facerecog/camerax/GraphicOverlay;Lkotlin/jvm/functions/Function3;)V", "detector", "Lcom/google/mlkit/vision/face/FaceDetector;", "graphicOverlay", "getGraphicOverlay", "()Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "realTimeOpts", "Lcom/google/mlkit/vision/face/FaceDetectorOptions;", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "results", "rect", "stop", "Companion", "app_debug"})
public final class FaceContourDetectionProcessor extends com.kkennib.facerecog.camerax.BaseImageAnalyzer<java.util.List<? extends com.google.mlkit.vision.face.Face>> {
    private final com.kkennib.facerecog.camerax.GraphicOverlay view = null;
    private final kotlin.jvm.functions.Function3<android.media.Image, android.graphics.Rect, android.graphics.Rect, kotlin.Unit> action = null;
    private final com.google.mlkit.vision.face.FaceDetectorOptions realTimeOpts = null;
    private final com.google.mlkit.vision.face.FaceDetector detector = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.vision.face_detection.FaceContourDetectionProcessor.Companion Companion = null;
    private static final java.lang.String TAG = "FaceDetectorProcessor";
    
    public FaceContourDetectionProcessor(@org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay view, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function3<? super android.media.Image, ? super android.graphics.Rect, ? super android.graphics.Rect, kotlin.Unit> action) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kkennib.facerecog.camerax.GraphicOverlay getGraphicOverlay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.face.Face>> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.common.InputImage image) {
        return null;
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    protected void onSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.mlkit.vision.face.Face> results, @org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay graphicOverlay, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect rect, @org.jetbrains.annotations.NotNull()
    android.media.Image image) {
    }
    
    @java.lang.Override()
    protected void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/kkennib/facerecog/vision/face_detection/FaceContourDetectionProcessor$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}