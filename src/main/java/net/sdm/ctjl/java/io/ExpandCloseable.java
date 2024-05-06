package net.sdm.ctjl.java.io;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sdm.ctjl.CraftTweakerJavaLibrary;
import org.openzen.zencode.java.ZenCodeType;

import java.io.Closeable;
import java.io.IOException;

@ZenRegister
@NativeTypeRegistration(value = Closeable.class, zenCodeName = "mods.ctjl.java.io.Closeable")
public class ExpandCloseable {
    @ZenCodeType.Method
    public static void close(Closeable closeable) throws IOException {
        closeable.close();
    }
}
