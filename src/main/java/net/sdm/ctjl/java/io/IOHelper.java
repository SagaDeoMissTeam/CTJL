package net.sdm.ctjl.java.io;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.URI;
import java.nio.file.Path;

@ZenRegister
@ZenCodeType.Name("mods.ctjl.java.io.IOHelper")
public class IOHelper {

    @ZenCodeType.Method
    @ZenCodeType.Getter("nullOutputStream")
    public static OutputStream nullOutputStream() {
        return OutputStream.nullOutputStream();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("nullWriter")
    public static Writer nullWriter() {
        return Writer.nullWriter();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("nullReader")
    public static Reader nullReader() {
        return Reader.nullReader();
    }

    @ZenCodeType.Method
    @ZenCodeType.Getter("nullInputStream")
    public static InputStream nullInputStream() {
        return InputStream.nullInputStream();
    }

    @ZenCodeType.Method
    public static Path of(String path){
        return Path.of(path);
    }
    @ZenCodeType.Method
    public static Path of(URI path){
        return Path.of(path);
    }
}
