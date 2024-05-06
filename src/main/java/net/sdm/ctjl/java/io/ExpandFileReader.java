package net.sdm.ctjl.java.io;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileReader;
import java.nio.charset.Charset;

@ZenRegister
@NativeTypeRegistration(value = FileReader.class, zenCodeName = "mods.ctjl.java.io.FileReader",
        constructors = {
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "fileName", type = String.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "file", type = File.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "file", type = FileDescriptor.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "file", type = String.class),
                                @NativeConstructor.ConstructorParameter(name = "charset", type = Charset.class)
                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "file", type = File.class),
                                @NativeConstructor.ConstructorParameter(name = "charset", type = Charset.class)
                        }
                )
        }
)
public class ExpandFileReader {

}
