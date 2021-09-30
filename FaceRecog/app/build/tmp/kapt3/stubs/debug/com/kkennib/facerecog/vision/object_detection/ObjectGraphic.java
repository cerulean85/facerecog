package com.kkennib.facerecog.vision.object_detection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/kkennib/facerecog/vision/object_detection/ObjectGraphic;", "Lcom/kkennib/facerecog/camerax/GraphicOverlay$Graphic;", "overlay", "Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "visionObject", "Lcom/google/mlkit/vision/objects/DetectedObject;", "imageRect", "Landroid/graphics/Rect;", "(Lcom/kkennib/facerecog/camerax/GraphicOverlay;Lcom/google/mlkit/vision/objects/DetectedObject;Landroid/graphics/Rect;)V", "boxPaint", "Landroid/graphics/Paint;", "textPaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "Companion", "app_debug"})
public final class ObjectGraphic extends com.kkennib.facerecog.camerax.GraphicOverlay.Graphic {
    private final com.google.mlkit.vision.objects.DetectedObject visionObject = null;
    private final android.graphics.Rect imageRect = null;
    private final android.graphics.Paint boxPaint = null;
    private final android.graphics.Paint textPaint = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.vision.object_detection.ObjectGraphic.Companion Companion = null;
    private static final float TEXT_SIZE = 54.0F;
    private static final float TEXT_ROUND_CORNER = 8.0F;
    
    public ObjectGraphic(@org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.objects.DetectedObject visionObject, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect imageRect) {
        super(null);
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/kkennib/facerecog/vision/object_detection/ObjectGraphic$Companion;", "", "()V", "TEXT_ROUND_CORNER", "", "TEXT_SIZE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}