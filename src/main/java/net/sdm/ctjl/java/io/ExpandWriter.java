package net.sdm.ctjl.java.io;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sdm.ctjl.CraftTweakerJavaLibrary;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.io.Writer;

@ZenRegister
@NativeTypeRegistration(value = Writer.class, zenCodeName = "mods.ctjl.java.io.Writer")
public class ExpandWriter {


    @ZenCodeType.Method
    public static void write(Writer writer, String str) throws IOException {
        writer.write(str);
    }
    @ZenCodeType.Method
    public static void write(Writer writer, int c) throws IOException {
        writer.write(c);
    }

    @ZenCodeType.Method
    public static void write(Writer writer, char[] c) throws IOException {
        writer.write(c);
    }
    @ZenCodeType.Method
    public static void write(Writer writer, String c, int off, int len) throws IOException {
        writer.write(c,off,len);
    }
    @ZenCodeType.Method
    public static void write(Writer writer, char[] c, int off, int len) throws IOException {
        writer.write(c,off,len);
    }
}
