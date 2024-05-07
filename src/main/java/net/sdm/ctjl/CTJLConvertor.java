package net.sdm.ctjl;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.stream.Stream;

@ZenRegister
@ZenCodeType.Name("mods.ctjl.api.CTJLConvertor ")
public class CTJLConvertor {

    @ZenCodeType.Method
    public static List<?> toList(Stream<?> stream){
        return stream.toList();
    }
}
