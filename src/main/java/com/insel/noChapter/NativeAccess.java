package com.insel.noChapter;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Platform;

class NativeAccess {
	
	public interface CLibrary extends Library {
        CLibrary INSTANCE = (CLibrary)
            Native.load((Platform.isWindows() ? "msvcrt" : "c"),
                                CLibrary.class);

        int strlen(String s);
        void printf(String format, Object ... objects);
    }
	
	public static void main(String [] args) {
		System.out.println(CLibrary.INSTANCE.strlen("Defqwop - Heart Afire (ft. Strix)"));
		CLibrary.INSTANCE.printf("This is hello from java to C and off course\n");
		CLibrary.INSTANCE.printf("Hello world!");
	}
}