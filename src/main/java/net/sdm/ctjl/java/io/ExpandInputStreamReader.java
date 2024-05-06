package net.sdm.ctjl.java.io;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

@ZenRegister
@NativeTypeRegistration(value = InputStreamReader.class, zenCodeName = "mods.ctjl.java.io.InputStreamReader",
constructors = {
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "in", type = InputStream.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "in", type = InputStream.class),
                                @NativeConstructor.ConstructorParameter(name = "charsetName", type = String.class),
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "im", type = InputStream.class),
                                @NativeConstructor.ConstructorParameter(name = "cs", type = Charset.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "in", type = InputStream.class),
                                @NativeConstructor.ConstructorParameter(name = "encoder", type = CharsetDecoder.class)
                        }
                )
        }
)
public class ExpandInputStreamReader {

    @ZenCodeType.Method
    public static boolean ready(InputStreamReader reader) throws IOException {
        return reader.ready();
    }
    @ZenCodeType.Method
    public static int read(InputStreamReader reader, CharBuffer s) throws IOException {
        return reader.read(s);
    }
    @ZenCodeType.Method
    public static int read(InputStreamReader reader) throws IOException {
        return reader.read();
    }
    @ZenCodeType.Method
    public static int read(InputStreamReader reader, char[] c, int l, int o) throws IOException {
        return reader.read(c,l,o);
    }
    @ZenCodeType.Method
    public static String getEncoding(InputStreamReader reader){
        return reader.getEncoding();
    }
}
