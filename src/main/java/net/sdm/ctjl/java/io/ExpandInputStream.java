package net.sdm.ctjl.java.io;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@ZenRegister
@NativeTypeRegistration(value = InputStream.class, zenCodeName = "mods.ctjl.java.io.InputStream",
        constructors = {
                @NativeConstructor( {} )
        }
)
public class ExpandInputStream {

    @ZenCodeType.Method
    public static byte[] readAllBytes(InputStream inputStream) throws IOException {
        return inputStream.readAllBytes();
    }
    @ZenCodeType.Method
    public static boolean markSupported(InputStream inputStream) {
        return inputStream.markSupported();
    }
    @ZenCodeType.Method
    public static int available(InputStream inputStream) throws IOException {
        return inputStream.available();
    }
    @ZenCodeType.Method
    public static long transferTo(InputStream inputStream, OutputStream stream) throws IOException {
        return inputStream.transferTo(stream);
    }
    @ZenCodeType.Method
    public static int read(InputStream inputStream) throws IOException {
        return inputStream.read();
    }
    @ZenCodeType.Method
    public static int read(InputStream inputStream, byte[] b, int l, int o) throws IOException {
        return inputStream.read(b,l,o);
    }
    @ZenCodeType.Method
    public static int readNBytes(InputStream inputStream, byte[] b, int l, int o) throws IOException {
        return inputStream.readNBytes(b,l,o);
    }
    @ZenCodeType.Method
    public static byte[] readNBytes(InputStream inputStream, int len) throws IOException {
        return inputStream.readNBytes(len);
    }
    @ZenCodeType.Method
    public static void reset(InputStream inputStream) throws IOException {
         inputStream.reset();
    }
}
