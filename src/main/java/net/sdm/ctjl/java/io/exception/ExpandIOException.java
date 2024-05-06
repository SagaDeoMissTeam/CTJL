package net.sdm.ctjl.java.io.exception;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;

import java.io.IOException;
import java.io.InputStreamReader;

@ZenRegister
@NativeTypeRegistration(value = IOException.class, zenCodeName = "mods.ctjl.java.io.IOException")
public class ExpandIOException {
}
