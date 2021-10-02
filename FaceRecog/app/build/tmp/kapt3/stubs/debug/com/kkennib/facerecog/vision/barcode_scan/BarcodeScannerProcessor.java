package com.kkennib.facerecog.vision.barcode_scan;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0014\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016H\u0014J.\u0010\u0017\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0013H\u0016R\u0014\u0010\u0007\u001a\u00020\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/kkennib/facerecog/vision/barcode_scan/BarcodeScannerProcessor;", "Lcom/kkennib/facerecog/camerax/BaseImageAnalyzer;", "", "Lcom/google/mlkit/vision/barcode/Barcode;", "view", "Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "(Lcom/kkennib/facerecog/camerax/GraphicOverlay;)V", "graphicOverlay", "getGraphicOverlay", "()Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "options", "Lcom/google/mlkit/vision/barcode/BarcodeScannerOptions;", "scanner", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "results", "rect", "Landroid/graphics/Rect;", "Landroid/media/Image;", "stop", "Companion", "app_debug"})
public final class BarcodeScannerProcessor extends com.kkennib.facerecog.camerax.BaseImageAnalyzer<java.util.List<? extends com.google.mlkit.vision.barcode.Barcode>> {
    private final com.kkennib.facerecog.camerax.GraphicOverlay view = null;
    private final com.google.mlkit.vision.barcode.BarcodeScannerOptions options = null;
    private final com.google.mlkit.vision.barcode.BarcodeScanner scanner = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.vision.barcode_scan.BarcodeScannerProcessor.Companion Companion = null;
    private static final java.lang.String TAG = "BarcodeScanProcessor";
    
    public BarcodeScannerProcessor(@org.jetbrains.annotations.NotNull()
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
    protected com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.barcode.Barcode>> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.common.InputImage image) {
        return null;
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @java.lang.Override()
    protected void onSuccess(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.mlkit.vision.barcode.Barcode> results, @org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay graphicOverlay, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect rect, @org.jetbrains.annotations.NotNull()
    android.media.Image image) {
    }
    
    @java.lang.Override()
    protected void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/kkennib/facerecog/vision/barcode_scan/BarcodeScannerProcessor$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}