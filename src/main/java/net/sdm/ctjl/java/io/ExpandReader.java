package net.sdm.ctjl.java.io;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;

@ZenRegister
@NativeTypeRegistration(value = Reader.class, zenCodeName = "mods.ctjl.java.io.Reader")
public class ExpandReader {

    @ZenCodeType.Method
    public static int read(Reader reader) throws IOException {
        return reader.read();
    }
    @ZenCodeType.Method
    public static int read(Reader reader, CharBuffer buffer) throws IOException {
        return reader.read(buffer);
    }
    @ZenCodeType.Method
    public static int read(Reader reader, char[] chars) throws IOException {
        return reader.read(chars);
    }
    @ZenCodeType.Method
    public static int read(Reader reader, char[] chars, int off, int len) throws IOException {
        return reader.read(chars, off,len);
    }
    @ZenCodeType.Method
    public static long skip(Reader reader, long t) throws IOException {
        return reader.skip(t);
    }
    @ZenCodeType.Method
    public static long skip(Reader reader, Writer t) throws IOException {
        return reader.transferTo(t);
    }
    @ZenCodeType.Method
    public static boolean markSupported(Reader reader) {
        return reader.markSupported();
    }
    @ZenCodeType.Method
    public static void mark(Reader reader, int readAheadLimit) throws IOException {
         reader.mark(readAheadLimit);
    }
    @ZenCodeType.Method
    public static void reset(Reader reader) throws IOException {
         reader.reset();
    }
}
