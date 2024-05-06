package net.sdm.ctjl.java.lang;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.util.stream.IntStream;

@ZenRegister
@NativeTypeRegistration(value = CharSequence.class, zenCodeName = "mods.ctjl.java.io.CharSequence")
public class ExpandCharSequence {

    @ZenCodeType.Method
    public static char charAt(CharSequence charSequence, int index){
        return charSequence.charAt(index);
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("chars")
    public static IntStream chars(CharSequence charSequence){
        return charSequence.chars();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("length")
    public static int length(CharSequence charSequence){
        return charSequence.length();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("codePoints")
    public static IntStream codePoints(CharSequence charSequence){
        return charSequence.codePoints();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("isEmpty")
    public static boolean isEmpty(CharSequence charSequence){
        return charSequence.isEmpty();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("toString")
    public static String toString(CharSequence charSequence){
        return charSequence.toString();
    }
    @ZenCodeType.Method
    public static CharSequence subSequence(CharSequence charSequence, int start, int end){
        return charSequence.subSequence(start, end);
    }
}
