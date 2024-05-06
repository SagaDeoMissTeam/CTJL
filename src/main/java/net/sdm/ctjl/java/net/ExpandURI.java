package net.sdm.ctjl.java.net;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;

import java.net.URI;

@ZenRegister
@NativeTypeRegistration(value = URI.class, zenCodeName = "mods.ctjl.java.net.URI",
        constructors = {
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "in", type = String.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "sheme", type = String.class),
                                @NativeConstructor.ConstructorParameter(name = "path", type = String.class),
                        }
                )
        }
)
public class ExpandURI {

}
