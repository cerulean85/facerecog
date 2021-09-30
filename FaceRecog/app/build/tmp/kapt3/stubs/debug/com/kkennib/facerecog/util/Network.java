package com.kkennib.facerecog.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/kkennib/facerecog/util/Network;", "", "()V", "Companion", "app_debug"})
public final class Network {
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.util.Network.Companion Companion = null;
    
    public Network() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/kkennib/facerecog/util/Network$Companion;", "", "()V", "bitmapToByteArray", "", "bitmap", "Landroid/graphics/Bitmap;", "mediaImageToBitmap", "mediaImage", "Landroid/media/Image;", "mediaImageToByteArray", "sendBoundingBoxPosition", "", "image", "boundingBox", "Landroid/graphics/Rect;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void sendBoundingBoxPosition(@org.jetbrains.annotations.NotNull()
        android.media.Image image, @org.jetbrains.annotations.NotNull()
        android.graphics.Rect boundingBox) {
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