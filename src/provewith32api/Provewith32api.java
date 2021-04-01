package provewith32api;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.ptr.ShortByReference;

import JNAinterface.JNAinterface;

public class Provewith32api {
    public static void main(String args[]) {
        JNAinterface jnaLib = JNAinterface.INSTANCE;
        jnaLib.printf("Hello World");
        String testName = null;

        for (int i = 0; i < args.length; i++) {
            jnaLib.printf("\nArgument %d : %s", i, args[i]);
        }

        jnaLib.printf("\nPlease Enter Your Name:\n");
        jnaLib.scanf("%s", testName);
        jnaLib.printf("\nYour name is %s", testName);
    }
}

