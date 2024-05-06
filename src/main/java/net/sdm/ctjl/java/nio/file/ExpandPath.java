package net.sdm.ctjl.java.nio.file;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.File;
import java.net.URI;
import java.nio.file.Path;

@ZenRegister
@NativeTypeRegistration(value = Path.class, zenCodeName = "mods.ctjl.java.nio.file.Path")
public class ExpandPath {

    @ZenCodeType.Method
    public static File toFile(Path path){
        return path.toFile();
    }
    @ZenCodeType.Method
    public static Path resolve(Path path, Path ph){
        return path.resolve(ph);
    }
    @ZenCodeType.Method
    public static Path resolve(Path path, String ph){
        return path.resolve(ph);
    }
    @ZenCodeType.Method
    public static Path getFileName(Path path){
        return path.getFileName();
    }
    @ZenCodeType.Method
    public static Path getName(Path path, int i){
        return path.getName(i);
    }
    @ZenCodeType.Method
    public static Path getRoot(Path path){
        return path.getRoot();
    }
    @ZenCodeType.Method
    public static Path getParent(Path path){
        return path.getParent();
    }
    @ZenCodeType.Method
    public static int getNameCount(Path path){
        return path.getNameCount();
    }
    @ZenCodeType.Method
    public static String toString(Path path){
        return path.toString();
    }
    @ZenCodeType.Method
    public static boolean startsWith(Path path, String other){
        return path.startsWith(other);
    }
    @ZenCodeType.Method
    public static boolean endsWith(Path path, String other){
        return path.endsWith(other);
    }
    @ZenCodeType.Method
    public static URI toUri(Path path){
        return path.toUri();
    }
}
