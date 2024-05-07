package net.sdm.ctjl.java.lang;

import com.blamejared.crafttweaker.api.CraftTweakerAPI;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.IOException;

@ZenRegister
@NativeTypeRegistration(value = Appendable.class, zenCodeName = "mods.ctjl.java.lang.Appendable")
public class ExpandAppendable {

    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Appendable append(Appendable appendable, char cht) throws IOException {
        return appendable.append(cht);
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Appendable append(Appendable appendable, CharSequence cht) throws IOException {
        return appendable.append(cht);
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Appendable append(Appendable appendable, CharSequence cht, int start,int end) throws IOException {
        return appendable.append(cht,start,end);
    }
}
