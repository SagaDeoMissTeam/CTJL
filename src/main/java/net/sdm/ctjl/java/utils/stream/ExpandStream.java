package net.sdm.ctjl.java.utils.stream;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.stream.Stream;

@ZenRegister
@NativeTypeRegistration(value = Stream.class, zenCodeName = "mods.ctjl.java.util.stream.Stream")
public class ExpandStream {

    @ZenCodeType.Method
    public static List<?> toList(Stream<?> stream){
        return stream.toList();
    }
}
