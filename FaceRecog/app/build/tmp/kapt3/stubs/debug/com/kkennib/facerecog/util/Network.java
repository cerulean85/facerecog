package com.kkennib.facerecog.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/kkennib/facerecog/util/Network;", "", "()V", "Companion", "app_debug"})
public final class Network {
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.util.Network.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String serverIP = "http://192.168.219.101:5000/";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String mediaType = "application/json; charset=utf-8";
    
    public Network() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JF\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u0012J\u0006\u0010\u0014\u001a\u00020\nJ>\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u0012J6\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\n0\u0012J\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u001b\u001a\u00020\nR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\u00a8\u0006\u001c"}, d2 = {"Lcom/kkennib/facerecog/util/Network$Companion;", "", "()V", "mediaType", "", "getMediaType", "()Ljava/lang/String;", "serverIP", "getServerIP", "insertUserInfo", "", "profileByteArr", "", "boundingBox", "Landroid/graphics/Rect;", "data", "Lcom/kkennib/facerecog/util/ConnData;", "action", "Lkotlin/Function1;", "error", "recognizeFace", "request", "requestType", "selectUserInfo", "sendBoundingBoxPosition", "image", "Landroid/media/Image;", "updateUserInfo", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getServerIP() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMediaType() {
            return null;
        }
        
        public final void request(@org.jetbrains.annotations.NotNull()
        java.lang.String requestType, @org.jetbrains.annotations.NotNull()
        com.kkennib.facerecog.util.ConnData data, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> action, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> error) {
        }
        
        public final void selectUserInfo(@org.jetbrains.annotations.NotNull()
        com.kkennib.facerecog.util.ConnData data, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> action, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> error) {
        }
        
        public final void insertUserInfo(@org.jetbrains.annotations.NotNull()
        byte[] profileByteArr, @org.jetbrains.annotations.NotNull()
        android.graphics.Rect boundingBox, @org.jetbrains.annotations.NotNull()
        com.kkennib.facerecog.util.ConnData data, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> action, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> error) {
        }
        
        public final void updateUserInfo() {
        }
        
        public final void recognizeFace() {
        }
        
        public final void sendBoundingBoxPosition(@org.jetbrains.annotations.NotNull()
        android.media.Image image, @org.jetbrains.annotations.NotNull()
        android.graphics.Rect boundingBox) {
        }
    }
}