package net.sdm.ctjl.java.io;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sdm.ctjl.SLog;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;
import java.nio.CharBuffer;

@ZenRegister
@NativeTypeRegistration(value = Readable.class, zenCodeName = "mods.ctjl.java.io.Readable")
public class ExpandReadable {

    @ZenCodeType.Method
    public static void read(Readable readable, CharBuffer buffer) throws IOException {
        readable.read(buffer);
    }
}
