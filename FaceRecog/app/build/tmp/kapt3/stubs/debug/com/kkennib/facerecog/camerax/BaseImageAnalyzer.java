package com.kkennib.facerecog.camerax;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000fH$J\u0014\u0010\u0010\u001a\u00020\t2\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013H$J-\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u0018H$\u00a2\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\tH&R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001b"}, d2 = {"Lcom/kkennib/facerecog/camerax/BaseImageAnalyzer;", "T", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "()V", "graphicOverlay", "Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "getGraphicOverlay", "()Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "analyze", "", "imageProxy", "Landroidx/camera/core/ImageProxy;", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "results", "rect", "Landroid/graphics/Rect;", "Landroid/media/Image;", "(Ljava/lang/Object;Lcom/kkennib/facerecog/camerax/GraphicOverlay;Landroid/graphics/Rect;Landroid/media/Image;)V", "stop", "app_debug"})
public abstract class BaseImageAnalyzer<T extends java.lang.Object> implements androidx.camera.core.ImageAnalysis.Analyzer {
    
    public BaseImageAnalyzer() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kkennib.facerecog.camerax.GraphicOverlay getGraphicOverlay();
    
    @android.annotation.SuppressLint(value = {"UnsafeExperimentalUsageError", "UnsafeOptInUsageError"})
    @java.lang.Override()
    public void analyze(@org.jetbrains.annotations.NotNull()
    androidx.camera.core.ImageProxy imageProxy) {
    }
    
    public abstract void stop();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract com.google.android.gms.tasks.Task<T> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.common.InputImage image);
    
    protected abstract void onSuccess(T results, @org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay graphicOverlay, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect rect, @org.jetbrains.annotations.NotNull()
    android.media.Image image);
    
    protected abstract void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e);
}