package net.sdm.ctjl.java.io;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

@ZenRegister
@NativeTypeRegistration(value = FileWriter.class, zenCodeName = "mods.ctjl.java.io.FileWriter",
constructors = {
        @NativeConstructor(
                {
                        @NativeConstructor.ConstructorParameter(name = "file", type = String.class)
                }
        ),
        @NativeConstructor(
                {
                        @NativeConstructor.ConstructorParameter(name = "file", type = String.class),
                        @NativeConstructor.ConstructorParameter(name = "append", type = boolean.class)
                }
        ),
        @NativeConstructor(
                {
                        @NativeConstructor.ConstructorParameter(name = "file", type = File.class)
                }
        ),
        @NativeConstructor(
                {
                        @NativeConstructor.ConstructorParameter(name = "file", type = File.class),
                        @NativeConstructor.ConstructorParameter(name = "append", type = boolean.class)
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
                        @NativeConstructor.ConstructorParameter(name = "file", type = String.class),
                        @NativeConstructor.ConstructorParameter(name = "charset", type = Charset.class),
                        @NativeConstructor.ConstructorParameter(name = "append", type = boolean.class)
                }
        ),
        @NativeConstructor(
                {
                        @NativeConstructor.ConstructorParameter(name = "file", type = File.class),
                        @NativeConstructor.ConstructorParameter(name = "charset", type = Charset.class)
                }
        ),
        @NativeConstructor(
                {
                        @NativeConstructor.ConstructorParameter(name = "file", type = File.class),
                        @NativeConstructor.ConstructorParameter(name = "charset", type = Charset.class),
                        @NativeConstructor.ConstructorParameter(name = "append", type = boolean.class),
                }
        )
    }
)
public class ExpandFileWriter {

    public static void get(FileWriter writer){

    }
}
