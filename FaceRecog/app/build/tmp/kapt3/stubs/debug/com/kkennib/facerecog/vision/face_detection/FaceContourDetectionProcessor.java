package com.kkennib.facerecog.vision.face_detection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001f2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001fB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0014J\u0014\u0010\u0015\u001a\u00020\b2\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018H\u0014J.\u0010\u0019\u001a\u00020\b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/kkennib/facerecog/vision/face_detection/FaceContourDetectionProcessor;", "Lcom/kkennib/facerecog/camerax/BaseImageAnalyzer;", "", "Lcom/google/mlkit/vision/face/Face;", "view", "Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "action", "Lkotlin/Function0;", "", "(Lcom/kkennib/facerecog/camerax/GraphicOverlay;Lkotlin/jvm/functions/Function0;)V", "detector", "Lcom/google/mlkit/vision/face/FaceDetector;", "graphicOverlay", "getGraphicOverlay", "()Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "realTimeOpts", "Lcom/google/mlkit/vision/face/FaceDetectorOptions;", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "results", "rect", "Landroid/graphics/Rect;", "Landroid/media/Image;", "stop", "Companion", "app_debug"})
public final class FaceContourDetectionProcessor extends com.kkennib.facerecog.camerax.BaseImageAnalyzer<java.util.List<? extends com.google.mlkit.vision.face.Face>> {
    private final com.kkennib.facerecog.camerax.GraphicOverlay view = null;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> action = null;
    private final com.google.mlkit.vision.face.FaceDetectorOptions realTimeOpts = null;
    private final com.google.mlkit.vision.face.FaceDetector detector = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.vision.face_detection.FaceContourDetectionProcessor.Companion Companion = null;
    private static final java.lang.String TAG = "FaceDetectorProcessor";
    
    public FaceContourDetectionProcessor(@org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay view, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> action) {
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