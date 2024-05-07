package net.sdm.ctjl.java.lang;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.Reader;

@ZenRegister
@NativeTypeRegistration(value = Thread.class, zenCodeName = "mods.ctjl.java.lang.Thread",
        constructors = {
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "reader", type = String.class)
                        }
                ),
                @NativeConstructor(
                        {

                        }
                ),
                @NativeConstructor(
                        {
                                @NativeConstructor.ConstructorParameter(name = "reader", type = Runnable.class)
                        }
                )
        }
)
public class ExpandThread {

    @ZenCodeType.Method
    public static void start(Thread thread){
         thread.start();
    }
    @ZenCodeType.Method
    public static void run(Thread thread){
         thread.run();
    }
    @ZenCodeType.Method
    public static int getPriority(Thread thread){
         return thread.getPriority();
    }
    @ZenCodeType.Method
    public static long getId(Thread thread){
         return thread.getId();
    }
    @ZenCodeType.Method
    public static String getName(Thread thread){
         return thread.getName();
    }
    @ZenCodeType.Method
    public static boolean isAlive(Thread thread){
         return thread.isAlive();
    }
    @ZenCodeType.Method
    public static boolean isDaemon(Thread thread){
         return thread.isDaemon();
    }
    @ZenCodeType.Method
    public static boolean isInterrupted(Thread thread){
         return thread.isInterrupted();
    }
}
