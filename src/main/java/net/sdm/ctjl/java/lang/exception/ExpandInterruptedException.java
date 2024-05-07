package net.sdm.ctjl.java.lang.exception;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;

import java.util.concurrent.CompletableFuture;

@ZenRegister
@NativeTypeRegistration(value = InterruptedException.class, zenCodeName = "mods.ctjl.java.lang.InterruptedException")
public class ExpandInterruptedException {
}
