package net.sdm.ctjl.java.lang.exception;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import java.util.concurrent.ExecutionException;

@ZenRegister
@NativeTypeRegistration(value = ExecutionException.class, zenCodeName = "mods.ctjl.java.lang.ExecutionException")
public class ExpandExecutionException {
}
