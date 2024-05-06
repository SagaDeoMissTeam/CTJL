package net.sdm.ctjl.java.io;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

@ZenRegister
@NativeTypeRegistration(value = OutputStreamWriter.class, zenCodeName = "mods.ctjl.java.io.OutputStreamWriter",
constructors = {
        @NativeConstructor(
                {
                        @NativeConstructor.ConstructorParameter(name = "out", type = OutputStream.class),
                        @NativeConstructor.ConstructorParameter(name = "charsetName", type = String.class)
                }
        ),
        @NativeConstructor(
                {
                        @NativeConstructor.ConstructorParameter(name = "out", type = OutputStream.class)
                }
        ),
        @NativeConstructor(
                {
                        @NativeConstructor.ConstructorParameter(name = "out", type = OutputStream.class),
                        @NativeConstructor.ConstructorParameter(name = "cs", type = Charset.class)
                }
        ),
        @NativeConstructor(
                {
                        @NativeConstructor.ConstructorParameter(name = "out", type = OutputStream.class),
                        @NativeConstructor.ConstructorParameter(name = "encoder", type = CharsetEncoder.class)
                }
        )
    }
)
public class ExpandOutputStreamWriter {

    @ZenCodeType.Method
    @ZenCodeType.Getter("encoding")
    public static String getEncoding(OutputStreamWriter writer){
        return writer.getEncoding();

    }
}
