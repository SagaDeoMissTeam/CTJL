package net.sdm.ctjl.java.io.exception;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;

import java.io.FileNotFoundException;
import java.io.IOException;

@ZenRegister
@NativeTypeRegistration(value = FileNotFoundException.class, zenCodeName = "mods.ctjl.java.io.FileNotFoundException")
public class ExpandFileNotFoundException {
}
