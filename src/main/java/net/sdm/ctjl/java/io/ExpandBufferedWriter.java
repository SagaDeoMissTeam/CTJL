package net.sdm.ctjl.java.io;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.*;

@ZenRegister
@NativeTypeRegistration(value = BufferedWriter.class, zenCodeName = "mods.ctjl.java.io.BufferedWriter",
    constructors = {
            @NativeConstructor(
                    {
                            @NativeConstructor.ConstructorParameter(name = "writer", type = Writer.class)
                    }
            ),
            @NativeConstructor(
                    {
                            @NativeConstructor.ConstructorParameter(name = "writer", type = Writer.class),
                            @NativeConstructor.ConstructorParameter(name = "sz", type = int.class),
                    }
            )
    }
)
public class ExpandBufferedWriter {

    @ZenCodeType.Method
    public static void write(BufferedWriter writer, int c) throws IOException {
        writer.write(c);
    }
    @ZenCodeType.Method
    public static void close(BufferedWriter writer) throws IOException {
        writer.close();
    }
    @ZenCodeType.Method
    public static void flush(BufferedWriter writer) throws IOException {
        writer.flush();
    }
    @ZenCodeType.Method
    public static void newLine(BufferedWriter writer) throws IOException {
        writer.newLine();
    }
    @ZenCodeType.Method
    public static void write(BufferedWriter writer, String  c, int of, int len) throws IOException {
        writer.write(c, of, len);
    }
    @ZenCodeType.Method
    public static void write(BufferedWriter writer, char[]  c, int of, int len) throws IOException {
        writer.write(c,of,len);
    }
}
