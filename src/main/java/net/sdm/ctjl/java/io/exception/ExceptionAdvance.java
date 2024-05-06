package net.sdm.ctjl.java.io.exception;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.openzen.zencode.java.ZenCodeType;


/**
 * @docParam this Exception
 */
@ZenRegister
@ZenCodeType.Expansion("stdlib.Exception")
public class ExceptionAdvance {

    @ZenCodeType.Method
    @ZenCodeType.Getter("message")
    public static String getMessage(Exception e){
        return e.getMessage();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("localizeMessage")
    public static String getLocalizedMessage(Exception e){
        return e.getLocalizedMessage();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("toString")
    public static String toString(Exception e){
        return e.toString();
    }
}
