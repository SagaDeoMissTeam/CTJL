package net.sdm.ctjl.java.utils.concurrent;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.util.concurrent.CompletionStage;
import java.util.function.Consumer;

@ZenRegister
@NativeTypeRegistration(value = CompletionStage.class, zenCodeName = "mods.ctjl.java.util.concurrent.CompletionStage")
public class ExpandCompletionStage {

//    @ZenCodeType.Method
//    public static<T> CompletionStage<Void> acceptEither(CompletionStage<T> stage, CompletionStage<? extends T> other,
//                                               Consumer<? super T> action){
//       return stage.acceptEither(other,action);
//    }
}
