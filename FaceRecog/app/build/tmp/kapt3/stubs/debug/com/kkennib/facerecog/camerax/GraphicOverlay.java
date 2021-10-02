package com.kkennib.facerecog.camerax;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u00018B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000fJ\u0006\u00100\u001a\u00020.J\b\u00101\u001a\u00020.H\u0002J\u0006\u00102\u001a\u000203J\u0012\u00104\u001a\u00020.2\b\u00105\u001a\u0004\u0018\u00010(H\u0014J\u000e\u00106\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000fJ\u0006\u00107\u001a\u00020.R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R\u001a\u0010!\u001a\u00020\"X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u00069"}, d2 = {"Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cameraSelector", "", "getCameraSelector", "()I", "setCameraSelector", "(I)V", "graphics", "", "Lcom/kkennib/facerecog/camerax/GraphicOverlay$Graphic;", "getGraphics", "()Ljava/util/List;", "lock", "", "mOffsetX", "", "getMOffsetX", "()Ljava/lang/Float;", "setMOffsetX", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "mOffsetY", "getMOffsetY", "setMOffsetY", "mScale", "getMScale", "setMScale", "processBitmap", "Landroid/graphics/Bitmap;", "getProcessBitmap", "()Landroid/graphics/Bitmap;", "setProcessBitmap", "(Landroid/graphics/Bitmap;)V", "processCanvas", "Landroid/graphics/Canvas;", "getProcessCanvas", "()Landroid/graphics/Canvas;", "setProcessCanvas", "(Landroid/graphics/Canvas;)V", "add", "", "graphic", "clear", "initProcessCanvas", "isFrontMode", "", "onDraw", "canvas", "remove", "toggleSelector", "Graphic", "app_debug"})
public class GraphicOverlay extends android.view.View {
    private final java.lang.Object lock = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.kkennib.facerecog.camerax.GraphicOverlay.Graphic> graphics = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float mScale;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float mOffsetX;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Float mOffsetY;
    private int cameraSelector = androidx.camera.core.CameraSelector.LENS_FACING_BACK;
    public android.graphics.Bitmap processBitmap;
    public android.graphics.Canvas processCanvas;
    private java.util.HashMap _$_findViewCache;
    
    public GraphicOverlay(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kkennib.facerecog.camerax.GraphicOverlay.Graphic> getGraphics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMScale() {
        return null;
    }
    
    public final void setMScale(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMOffsetX() {
        return null;
    }
    
    public final void setMOffsetX(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getMOffsetY() {
        return null;
    }
    
    public final void setMOffsetY(@org.jetbrains.annotations.Nullable()
    java.lang.Float p0) {
    }
    
    public final int getCameraSelector() {
        return 0;
    }
    
    public final void setCameraSelector(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getProcessBitmap() {
        return null;
    }
    
    public final void setProcessBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Canvas getProcessCanvas() {
        return null;
    }
    
    public final void setProcessCanvas(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas p0) {
    }
    
    public final boolean isFrontMode() {
        return false;
    }
    
    public final void toggleSelector() {
    }
    
    public final void clear() {
    }
    
    public final void add(@org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay.Graphic graphic) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    com.kkennib.facerecog.camerax.GraphicOverlay.Graphic graphic) {
    }
    
    private final void initProcessCanvas() {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH&J\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/kkennib/facerecog/camerax/GraphicOverlay$Graphic;", "", "overlay", "Lcom/kkennib/facerecog/camerax/GraphicOverlay;", "(Lcom/kkennib/facerecog/camerax/GraphicOverlay;)V", "calculateRect", "Landroid/graphics/RectF;", "height", "", "width", "boundingBoxT", "Landroid/graphics/Rect;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "translateX", "horizontal", "translateY", "vertical", "app_debug"})
    public static abstract class Graphic {
        private final com.kkennib.facerecog.camerax.GraphicOverlay overlay = null;
        
        public Graphic(@org.jetbrains.annotations.NotNull()
        com.kkennib.facerecog.camerax.GraphicOverlay overlay) {
            super();
        }
        
        public abstract void draw(@org.jetbrains.annotations.Nullable()
        android.graphics.Canvas canvas);
        
        @org.jetbrains.annotations.NotNull()
        public final android.graphics.RectF calculateRect(float height, float width, @org.jetbrains.annotations.NotNull()
        android.graphics.Rect boundingBoxT) {
            return null;
        }
        
        public final float translateX(float horizontal) {
            return 0.0F;
        }
        
        public final float translateY(float vertical) {
            return 0.0F;
        }
    }
}