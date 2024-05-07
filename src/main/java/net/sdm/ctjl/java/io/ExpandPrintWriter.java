package net.sdm.ctjl.java.io;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.*;

@ZenRegister
@NativeTypeRegistration(value = PrintWriter.class, zenCodeName = "mods.ctjl.java.io.PrintWriter",
        constructors = {
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "fileName", type = String.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "fileName", type = File.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "writer", type = Writer.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "writer", type = Writer.class),
                                @NativeConstructor.ConstructorParameter(name = "autoFlush", type = boolean.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "stream", type = OutputStream.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "stream", type = OutputStream.class),
                                @NativeConstructor.ConstructorParameter(name = "autoFlush", type = boolean.class)
                        }
                )
        }
)
public class ExpandPrintWriter {

    @ZenCodeType.Method
    public static void close(PrintWriter writer){
        writer.close();
    }
    @ZenCodeType.Method
    public static PrintWriter append(PrintWriter writer, char c){
       return writer.append(c);
    }
    @ZenCodeType.Method
    public static PrintWriter append(PrintWriter writer, String c){
       return writer.append(c);
    }
    @ZenCodeType.Method
    public static PrintWriter format(PrintWriter writer, String c, Object... o){
       return writer.format(c,o);
    }
    @ZenCodeType.Method
    public static PrintWriter printf(PrintWriter writer, String c, Object... o){
       return writer.printf(c,o);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer){
        writer.println();
    }
    @ZenCodeType.Method
    public static void flush(PrintWriter writer){
        writer.flush();
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer, int s){
        writer.println(s);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer, long s){
        writer.println(s);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer, Object s){
        writer.println(s);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer, boolean s){
        writer.println(s);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer, String s){
        writer.println(s);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer, byte s){
        writer.println(s);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer, double s){
        writer.println(s);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer, float s){
        writer.println(s);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer, char s){
        writer.println(s);
    }
    @ZenCodeType.Method
    public static void println(PrintWriter writer, char[] s){
        writer.println(s);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter writer, int s){
        writer.print(s);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter writer, long s){
        writer.print(s);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter writer, Object s){
        writer.print(s);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter writer, boolean s){
        writer.print(s);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter writer, String s){
        writer.print(s);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter writer, byte s){
        writer.print(s);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter writer, double s){
        writer.print(s);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter writer, float s){
        writer.print(s);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter writer, char s){
        writer.print(s);
    }
    @ZenCodeType.Method
    public static void print(PrintWriter writer, char[] s){
        writer.print(s);
    }
}
