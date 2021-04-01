package JNAinterface;

import com.sun.jna.Platform;
import com.sun.jna.Native;
import com.sun.jna.Library;

public interface JNAinterface extends Library {
    JNAinterface INSTANCE = (JNAinterface) Native.loadLibrary((Platform.isWindows() ? "msvcrt" : "c"), JNAinterface.class);
    void printf(String format, Object... args);
    int sprintf(byte[] buffer, String format, Object... args);
    int scanf(String format, Object... args);
}