package com.kkennib.facerecog.vision.face_detection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001e\u0010\u0011\u001a\u00020\u000e*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0001\u0010\u0014\u001a\u00020\u0013H\u0002R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/kkennib/facerecog/vision/face_detection/FaceContourGraphic;", "Lcom/kkennib/facerecog/camerax/GraphicOverlay$Graphic;", "overlay", "Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "face", "Lcom/google/mlkit/vision/face/Face;", "imageRect", "Landroid/graphics/Rect;", "(Lcom/kkennib/facerecog/camerax/GraphicOverlay;Lcom/google/mlkit/vision/face/Face;Landroid/graphics/Rect;)V", "boxPaint", "Landroid/graphics/Paint;", "facePositionPaint", "idPaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "drawFace", "facePosition", "", "selectedColor", "Companion", "app_debug"})
public final class FaceContourGraphic extends com.kkennib.facerecog.camerax.GraphicOverlay.Graphic {
    private final com.google.mlkit.vision.face.Face face = null;
    private final android.graphics.Rect imageRect = null;
    private final android.graphics.Paint facePositionPaint = null;
    private final android.graphics.Paint idPaint = null;
    private final android.graphics.Paint boxPaint = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.vision.face_detection.FaceContourGraphic.Companion Companion = null;
    private static final float FACE_POSITION_RADIUS = 4.0F;
    private static final float ID_TEXT_SIZE = 30.0F;
    private static final float BOX_STROKE_WIDTH = 5.0F;
    
    public FaceContourGraphic(@org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.face.Face face, @org.jetbrains.annotations.NotNull()
    android.graphics.Rect imageRect) {
        super(null);
    }
    
    private final void drawFace(android.graphics.Canvas $this$drawFace, int facePosition, @androidx.annotation.ColorInt()
    int selectedColor) {
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/kkennib/facerecog/vision/face_detection/FaceContourGraphic$Companion;", "", "()V", "BOX_STROKE_WIDTH", "", "FACE_POSITION_RADIUS", "ID_TEXT_SIZE", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}