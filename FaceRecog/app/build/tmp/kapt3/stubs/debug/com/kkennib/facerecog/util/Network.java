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
    @org.jetbrains.annotations.NotNull()
    private static java.util.Queue<kotlin.jvm.functions.Function0<kotlin.Unit>> recognitionObjQueue;
    
    public Network() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J>\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0017J6\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0017J\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004J\u0006\u0010\u001c\u001a\u00020\nJN\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0017J>\u0010#\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0017J>\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0017J6\u0010&\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\n0\u0017R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006\u00a8\u0006\'"}, d2 = {"Lcom/kkennib/facerecog/util/Network$Companion;", "", "()V", "mediaType", "", "getMediaType", "()Ljava/lang/String;", "recognitionObjQueue", "Ljava/util/Queue;", "Lkotlin/Function0;", "", "getRecognitionObjQueue", "()Ljava/util/Queue;", "setRecognitionObjQueue", "(Ljava/util/Queue;)V", "serverIP", "getServerIP", "addRecognitionObject", "faceByteArr", "", "data", "Lcom/kkennib/facerecog/util/ConnData;", "action", "Lkotlin/Function1;", "error", "deleteUserInfo", "encodeSHA256", "input", "executeRecognitionFace", "insertUserInfo", "profileBitmap", "Landroid/graphics/Bitmap;", "faceBitmap", "boundingBox", "Landroid/graphics/Rect;", "non_thread_request", "requestType", "request", "selectUserInfo", "app_debug"})
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
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Queue<kotlin.jvm.functions.Function0<kotlin.Unit>> getRecognitionObjQueue() {
            return null;
        }
        
        public final void setRecognitionObjQueue(@org.jetbrains.annotations.NotNull()
        java.util.Queue<kotlin.jvm.functions.Function0<kotlin.Unit>> p0) {
        }
        
        public final void request(@org.jetbrains.annotations.NotNull()
        java.lang.String requestType, @org.jetbrains.annotations.NotNull()
        com.kkennib.facerecog.util.ConnData data, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> action, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> error) {
        }
        
        public final void non_thread_request(@org.jetbrains.annotations.NotNull()
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
        android.graphics.Bitmap profileBitmap, @org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap faceBitmap, @org.jetbrains.annotations.NotNull()
        android.graphics.Rect boundingBox, @org.jetbrains.annotations.NotNull()
        com.kkennib.facerecog.util.ConnData data, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> action, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> error) {
        }
        
        public final void deleteUserInfo(@org.jetbrains.annotations.NotNull()
        com.kkennib.facerecog.util.ConnData data, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> action, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> error) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String encodeSHA256(@org.jetbrains.annotations.NotNull()
        java.lang.String input) {
            return null;
        }
        
        public final void addRecognitionObject(@org.jetbrains.annotations.NotNull()
        byte[] faceByteArr, @org.jetbrains.annotations.NotNull()
        com.kkennib.facerecog.util.ConnData data, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> action, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.kkennib.facerecog.util.ConnData, kotlin.Unit> error) {
        }
        
        public final void executeRecognitionFace() {
        }
    }
}