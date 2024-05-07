package net.sdm.ctjl.java.nio.file;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.BracketEnum;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;

import java.nio.file.StandardOpenOption;

@ZenRegister
@NativeTypeRegistration(value = StandardOpenOption.class,zenCodeName = "mods.ctjl.java.nio.file.StandardOpenOption")
@Document("mods/ctjl/java/nio/file/StandardOpenOption")
@BracketEnum("standard/open/option")
public class ExpandStandardOpenOption {
}
