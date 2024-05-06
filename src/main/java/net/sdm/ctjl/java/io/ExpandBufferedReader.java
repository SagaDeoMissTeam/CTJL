package net.sdm.ctjl.java.io;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.*;
import java.nio.charset.Charset;
import java.util.stream.Stream;

@ZenRegister
@NativeTypeRegistration(value = BufferedReader.class, zenCodeName = "mods.ctjl.java.io.BufferedReader",
    constructors = {
            @NativeConstructor(
                    {
                            @NativeConstructor.ConstructorParameter(name = "reader", type = Reader.class)
                    }
            ),
            @NativeConstructor(
                    {
                            @NativeConstructor.ConstructorParameter(name = "reader", type = Reader.class),
                            @NativeConstructor.ConstructorParameter(name = "sz", type = int.class),
                    }
            )
    }
)
public class ExpandBufferedReader {

    @ZenCodeType.Method
    public static String readLine(BufferedReader reader) throws IOException {
        return reader.readLine();
    }
    @ZenCodeType.Method
    public static Stream<String> lines(BufferedReader reader) throws IOException {
        return reader.lines();
    }
    @ZenCodeType.Method
    public static int read(BufferedReader reader) throws IOException {
        return reader.read();
    }
    @ZenCodeType.Method
    public static int read(BufferedReader reader, char[] cht, int of, int len) throws IOException {
        return reader.read(cht,of,len);
    }
    @ZenCodeType.Method
    public static boolean markSupported(BufferedReader reader) {
        return reader.markSupported();
    }
    @ZenCodeType.Method
    public static boolean ready(BufferedReader reader) throws IOException {
        return reader.ready();
    }
    @ZenCodeType.Method
    public static long skip(BufferedReader reader, long i) throws IOException {
        return reader.skip(i);
    }
    @ZenCodeType.Method
    public static void reset(BufferedReader reader) throws IOException {
        reader.reset();
    }
    @ZenCodeType.Method
    public static void mark(BufferedReader reader, int i) throws IOException {
        reader.mark(i);
    }
}
