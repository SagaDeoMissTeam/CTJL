package net.sdm.ctjl.java.io;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.sdm.ctjl.CraftTweakerJavaLibrary;
import org.openzen.zencode.java.ZenCodeType;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

@ZenRegister
@NativeTypeRegistration(value = Flushable.class, zenCodeName = "mods.ctjl.java.io.Flushable")
public class ExpandFlushable {

    @ZenCodeType.Method
    public static void flush(Flushable flushable) throws IOException {
            flushable.flush();
    }
}
