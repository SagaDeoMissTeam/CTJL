package net.sdm.ctjl.test;

import net.sdm.ctjl.CTJLConstants;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public class TestClass {


    public static void get(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(Path.of(CTJLConstants.SCRIPTS_DIRECTORY).resolve("myText.txt").toFile()));



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
