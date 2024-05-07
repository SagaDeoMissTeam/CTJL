package net.sdm.ctjl.java.nio.file;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.apache.commons.lang3.CharSet;
import org.openzen.zencode.java.ZenCodeType;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

@ZenRegister
@ZenCodeType.Name("mods.ctjl.java.nio.file.Files")
public class ExpandFiles {

    @ZenCodeType.Method
    public static byte[] readAllBytes(Path path) throws IOException {
        return Files.readAllBytes(path);
    }
    @ZenCodeType.Method
    public static List<String> readAllLines(Path path) throws IOException {
        return Files.readAllLines(path);
    }
    @ZenCodeType.Method
    public static String readString(Path path) throws IOException {
        return Files.readString(path);
    }
    @ZenCodeType.Method
    public static Path write(Path path, byte[] bytes) throws IOException {
        return Files.write(path, bytes);
    }
    @ZenCodeType.Method
    public static Path write(Path path, byte[] bytes, StandardOpenOption operation) throws IOException {
        return Files.write(path, bytes, operation);
    }
    @ZenCodeType.Method
    public static Path writeString(Path path, String str) throws IOException {
        return Files.writeString(path, str);
    }
    @ZenCodeType.Method
    public static Path writeString(Path path, String str, StandardOpenOption operation) throws IOException {
        return Files.writeString(path, str, operation);
    }
    @ZenCodeType.Method
    public static BufferedWriter newBufferedWriter(Path path) throws IOException {
        return Files.newBufferedWriter(path);
    }
    @ZenCodeType.Method
    public static BufferedWriter newBufferedWriter(Path path, Charset chr) throws IOException {
        return Files.newBufferedWriter(path, chr);
    }
    @ZenCodeType.Method
    public static boolean isWritable(Path path) {
        return Files.isWritable(path);
    }
    @ZenCodeType.Method
    public static boolean isReadable(Path path) {
        return Files.isReadable(path);
    }
}
