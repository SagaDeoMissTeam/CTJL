package net.sdm.ctjl.java.utils.concurrent;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.openzen.zencode.java.ZenCodeGlobals;
import org.openzen.zencode.java.ZenCodeType;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;
import java.util.function.Supplier;


@ZenRegister
@ZenCodeType.Name("mods.ctjl.java.util.concurrent.AsyncHelper")
public class AsyncHelper {

    @ZenCodeGlobals.Global("async")
    public static final AsyncHelper ASYNC = new AsyncHelper();

    @ZenCodeType.Method
    public CompletableFuture<Integer> supplyAsync(Supplier<Integer> s){
        return CompletableFuture.supplyAsync(s);
    }

    @ZenCodeType.Method
    public CompletableFuture<Integer> completedFuture(Supplier<Integer> s){
        return CompletableFuture.completedFuture(s.get());
    }
    @ZenCodeType.Method
    public CompletableFuture<Void> runAsync(Runnable s){
        return CompletableFuture.runAsync(s);
    }

}
