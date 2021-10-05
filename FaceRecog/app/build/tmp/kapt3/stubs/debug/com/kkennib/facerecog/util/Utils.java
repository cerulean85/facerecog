package com.kkennib.facerecog.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/kkennib/facerecog/util/Utils;", "", "()V", "Companion", "app_debug"})
public final class Utils {
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.util.Utils.Companion Companion = null;
    
    public Utils() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J0\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J \u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0014J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u0014\u00a8\u0006\u001b"}, d2 = {"Lcom/kkennib/facerecog/util/Utils$Companion;", "", "()V", "bitmapToByteArray", "", "bitmap", "Landroid/graphics/Bitmap;", "getBitmapFromByteArray", "byteArr", "getCompressedBitmapByteArray", "getFaceBitmap", "profileBitmap", "orgWidth", "", "orgHeight", "boundingBox", "Landroid/graphics/Rect;", "imageRect", "getProfileBitmap", "profileImg", "Landroid/media/Image;", "scale", "", "getRealtimeFaceBitmap", "mediaImageToBitmap", "mediaImage", "mediaImageToByteArray", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getProfileBitmap(@org.jetbrains.annotations.NotNull()
        android.media.Image profileImg, @org.jetbrains.annotations.NotNull()
        android.graphics.Rect imageRect, boolean scale) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getFaceBitmap(@org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap profileBitmap, int orgWidth, int orgHeight, @org.jetbrains.annotations.NotNull()
        android.graphics.Rect boundingBox, @org.jetbrains.annotations.NotNull()
        android.graphics.Rect imageRect) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getRealtimeFaceBitmap(@org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap profileBitmap, @org.jetbrains.annotations.NotNull()
        android.graphics.Rect boundingBox) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap getBitmapFromByteArray(@org.jetbrains.annotations.NotNull()
        byte[] byteArr) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final byte[] getCompressedBitmapByteArray(@org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap bitmap) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.graphics.Bitmap mediaImageToBitmap(@org.jetbrains.annotations.NotNull()
        android.media.Image mediaImage) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final byte[] mediaImageToByteArray(@org.jetbrains.annotations.NotNull()
        android.media.Image mediaImage) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final byte[] bitmapToByteArray(@org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap) {
            return null;
        }
    }
}