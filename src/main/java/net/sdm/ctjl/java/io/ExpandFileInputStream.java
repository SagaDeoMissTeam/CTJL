package net.sdm.ctjl.java.io;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;

import java.io.File;
import java.io.FileInputStream;
import java.net.URI;

@ZenRegister
@NativeTypeRegistration(value = FileInputStream.class, zenCodeName = "mods.ctjl.java.io.FileInputStream",
        constructors = {
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "name", type = String.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "path", type = File.class)
                        }
                )
        }
)
public class ExpandFileInputStream {
}
