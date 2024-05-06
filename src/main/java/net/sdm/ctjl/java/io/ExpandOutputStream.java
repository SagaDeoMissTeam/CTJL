package net.sdm.ctjl.java.io;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sdm.ctjl.SLog;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.io.OutputStream;

@ZenRegister
@NativeTypeRegistration(value = OutputStream.class, zenCodeName = "mods.ctjl.java.io.OutputStream")
public class ExpandOutputStream {

    @ZenCodeType.Method
    public static void write(OutputStream stream, int b) throws IOException {
        stream.write(b);
    }
    @ZenCodeType.Method
    public static void write(OutputStream stream, byte[] b) throws IOException {
        stream.write(b);
    }
    @ZenCodeType.Method
    public static void write(OutputStream stream, byte[] b, int off ,int len) throws IOException {
        stream.write(b,off,len);
    }
}
