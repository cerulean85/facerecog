package com.kkennib.facerecog.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\f\u0010\n\u001a\u00020\u000b*\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/kkennib/facerecog/util/AES256Cryption;", "", "()V", "IV", "", "SECRET_KEY", "getCipher", "Ljavax/crypto/Cipher;", "mode", "", "hexSetToByteArray", "", "Companion", "app_debug"})
public final class AES256Cryption {
    private final java.lang.String SECRET_KEY = "HEXSTRING1";
    private final java.lang.String IV = "HEXSTRING2";
    @org.jetbrains.annotations.NotNull()
    public static final com.kkennib.facerecog.util.AES256Cryption.Companion Companion = null;
    
    private AES256Cryption() {
        super();
    }
    
    private final javax.crypto.Cipher getCipher(int mode) {
        return null;
    }
    
    private final byte[] hexSetToByteArray(java.lang.String $this$hexSetToByteArray) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lcom/kkennib/facerecog/util/AES256Cryption$Companion;", "", "()V", "decrypt", "", "encrypted", "encrypt", "plain", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String encrypt(@org.jetbrains.annotations.NotNull()
        java.lang.String plain) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String decrypt(@org.jetbrains.annotations.NotNull()
        java.lang.String encrypted) {
            return null;
        }
    }
}