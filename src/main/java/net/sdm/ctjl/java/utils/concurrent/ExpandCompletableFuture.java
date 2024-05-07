package net.sdm.ctjl.java.utils.concurrent;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;
import java.util.function.Function;

@ZenRegister
@NativeTypeRegistration(value = CompletableFuture.class, zenCodeName = "mods.ctjl.java.util.concurrent.CompletableFuture")
public class ExpandCompletableFuture {

    @ZenCodeType.Method
    @ZenCodeType.Getter("join")
    public static Object join(CompletableFuture<?> future){
        return future.join();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("getValue")
    public static Object getValue(CompletableFuture<?> future) throws Exception {
        return future.get();
    }

    @ZenCodeType.Method
    public static<T> CompletableFuture<T> whenComplete(CompletableFuture<T> future, BiConsumer<T, Throwable> action){
       return future.whenComplete(action);
    }

    @ZenCodeType.Method
    public static<T,U> CompletableFuture<U> thenApplyAsync(CompletableFuture<T> future, Function<T,U> fn){
        return future.thenApplyAsync(fn);
    }

}
