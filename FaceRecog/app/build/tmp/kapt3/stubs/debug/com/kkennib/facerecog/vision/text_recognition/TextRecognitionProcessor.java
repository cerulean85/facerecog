package com.kkennib.facerecog.vision.text_recognition;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0014\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013H\u0014J(\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0010H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/kkennib/facerecog/vision/text_recognition/TextRecognitionProcessor;", "Lcom/kkennib/facerecog/camerax/BaseImageAnalyzer;", "Lcom/google/mlkit/vision/text/Text;", "view", "Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "(Lcom/kkennib/facerecog/camerax/GraphicOverlay;)V", "graphicOverlay", "getGraphicOverlay", "()Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "recognizer", "Lcom/google/mlkit/vision/text/TextRecognizer;", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "results", "rect", "Landroid/graphics/Rect;", "Landroid/media/Image;", "stop", "Companion", "app_debug"})
public final class TextRecognitionProcessor extends com.kkennib.facerecog.camerax.BaseImageAnalyzer<com.google.mlkit.vision.text.Text> {
    private final com.kkennib.facerecog.camerax.GraphicOverlay view = null;
    private final com.google.mlkit.vision.text.TextRecognizer recognizer = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.vision.text_recognition.TextRecognitionProcessor.Companion Companion = null;
    private static final java.lang.String TAG = "TextProcessor";
    
    public TextRecognitionProcessor(@org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay view) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kkennib.facerecog.camerax.GraphicOverlay getGraphicOverlay() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.google.android.gms.tasks.Task<com.google.mlkit.vision.text.Text> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.common.InputImage image) {
        return null;
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    protected void onSuccess(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.text.Text results, @org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay graphicOverlay, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect rect, @org.jetbrains.annotations.NotNull()
    android.media.Image image) {
    }
    
    @java.lang.Override()
    protected void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/kkennib/facerecog/vision/text_recognition/TextRecognitionProcessor$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}