package net.sdm.ctjl.java.io;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;

@ZenRegister
@NativeTypeRegistration(value = File.class, zenCodeName = "mods.ctjl.java.io.File",
    constructors = {
            @NativeConstructor(
                    {
                            @NativeConstructor.ConstructorParameter(name = "uri", type = URI.class)
                    }
            ),
            @NativeConstructor(
                    {
                            @NativeConstructor.ConstructorParameter(name = "path", type = String.class)
                    }
            ),
            @NativeConstructor(
                    {
                            @NativeConstructor.ConstructorParameter(name = "path", type = File.class),
                            @NativeConstructor.ConstructorParameter(name = "child", type = String.class),
                    }
            ),
            @NativeConstructor(
                    {
                            @NativeConstructor.ConstructorParameter(name = "path", type = String.class),
                            @NativeConstructor.ConstructorParameter(name = "child", type = String.class),
                    }
            )
    }
)
public class ExpandFile {

    @ZenCodeType.Method
    public static boolean exists(File file){
        return file.exists();
    }
    @ZenCodeType.Method
    public static boolean isFile(File file){
        return file.isFile();
    }
    @ZenCodeType.Method
    public static boolean mkdir(File file){
        return file.mkdir();
    }
    @ZenCodeType.Method
    public static boolean mkdirs(File file){
        return file.mkdirs();
    }
    @ZenCodeType.Method
    public static boolean delete(File file){
        return file.delete();
    }
    @ZenCodeType.Method
    public static boolean isDirectory(File file){
        return file.isDirectory();
    }
    @ZenCodeType.Method
    public static boolean createNewFile(File file) throws IOException {
        return file.createNewFile();
    }
    @ZenCodeType.Method
    public static String getPath(File file) {
        return file.getPath();
    }
    @ZenCodeType.Method
    public static boolean renameTo(File file, File rename) {
        return file.renameTo(rename);
    }
    @ZenCodeType.Method
    public static File[] listFiles(File file) {
        return file.listFiles();
    }
    @ZenCodeType.Method
    public static String[] list(File file) {
        return file.list();
    }
    @ZenCodeType.Method
    public static String toString(File file) {
        return file.toString();
    }
    @ZenCodeType.Method
    public static boolean setWritable(File file, boolean write) {
        return file.setWritable(write);
    }
    @ZenCodeType.Method
    public static boolean canRead(File file) {
        return file.canRead();
    }
    @ZenCodeType.Method
    public static boolean canWrite(File file) {
        return file.canWrite();
    }
}
