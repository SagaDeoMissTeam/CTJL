package net.sdm.ctjl.runtime;

import com.blamejared.crafttweaker.api.CraftTweakerConstants;
import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import net.sdm.ctjl.SLog;
import org.openzen.zencode.java.ZenCodeType;

import javax.tools.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

@ZenRegister
@ZenCodeType.Name("mods.ctjl.example.SDMJavaCompiler")
public class SDMJavaCompiler {


    @ZenCodeType.Method
    public static void loadJavaFile(String pathToFolder, String classPath) throws Exception {
        loadJavaFile(pathToFolder, classPath, "main");
    }


    @ZenCodeType.Method
    public static void loadJavaFile(String pathToFolder, String classPath, String method) throws Exception {
        ClassLoader classLoader = System.class.getClassLoader();
        //получаем путь до нашей папки со сгенерированным кодом
        URLClassLoader urlClassLoader = new URLClassLoader(
                new URL[]{Path.of(CraftTweakerConstants.SCRIPTS_DIRECTORY).resolve(pathToFolder).toUri().toURL()},
                classLoader);
        //загружаем наш класс
        Class<?> helloHabrClass = urlClassLoader.loadClass(classPath);
        //находим и вызываем метод helloHabr
        Method methodHelloHabr = helloHabrClass.getMethod(method);
        //в параметре передается ссылка на экземпляр класса для вызова метода
        //либо null при вызове статического метода
        methodHelloHabr.invoke(null);
    }

    @ZenCodeType.Method
    public static void compileJavaFile(String filepath) throws IOException {
        Path srcPath = Path.of(CraftTweakerConstants.SCRIPTS_DIRECTORY).resolve(filepath);
        File file = srcPath.toFile();
        if(file.isFile()){
            JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
            try(StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null)) {
                //получаем список всех файлов описывающих исходники
                Iterable<? extends JavaFileObject> javaFiles = fileManager.getJavaFileObjects(file);

                DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
                //заводим задачу на компиляцию
                JavaCompiler.CompilationTask task = compiler.getTask(
                        null,
                        fileManager,
                        diagnostics,
                        null,
                        null,
                        javaFiles
                );
                //выполняем задачу
                task.call();
                //выводим ошибки, возникшие в процессе компиляции
                if(!diagnostics.getDiagnostics().isEmpty()){
                    for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
                        if(diagnostic.getLineNumber() != -1) {
                            SLog.LOGGER.error(String.format("SDMJavaCompiler Error on line %d in %s%n", diagnostic.getLineNumber(),
                                    diagnostic.getSource()));
                        }
                    }
                }
            }
        }
    }

    @ZenCodeType.Method
    public static void compileAllFiles(String folderPath) throws IOException {
        Path srcPath = Path.of(CraftTweakerConstants.SCRIPTS_DIRECTORY).resolve(folderPath);

        List<File> files = Files.list(srcPath)
                .map(Path::toFile)
                .collect(Collectors.toList());
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        try(StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null)) {
            Iterable<? extends JavaFileObject> javaFiles = fileManager.getJavaFileObjectsFromFiles(files);

            DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
            JavaCompiler.CompilationTask task = compiler.getTask(
                    null,
                    fileManager,
                    diagnostics,
                    null,
                    null,
                    javaFiles
            );
            task.call();
            if(!diagnostics.getDiagnostics().isEmpty()){
                for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
                    if(diagnostic.getLineNumber() != -1) {
                        SLog.LOGGER.error(String.format("SDMJavaCompiler Error on line %d in %s%n", diagnostic.getLineNumber(),
                                diagnostic.getSource()));
                    }
                }
            }
        }
    }


//    @ZenCodeType.Method
//    public static void runTest() throws Exception {
//        Path srcPath = Path.of(CraftTweakerConstants.SCRIPTS_DIRECTORY).resolve("hello");
//
//        List<File> files = Files.list(srcPath)
//                .map(Path::toFile)
//                .collect(Collectors.toList());
////получаем компилятор
//        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
////получаем новый инстанс fileManager для нашего компилятора
//        try(StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null)) {
//            //получаем список всех файлов описывающих исходники
//            Iterable<? extends JavaFileObject> javaFiles = fileManager.getJavaFileObjectsFromFiles(files);
//
//            DiagnosticCollector<JavaFileObject> diagnostics = new DiagnosticCollector<>();
//            //заводим задачу на компиляцию
//            JavaCompiler.CompilationTask task = compiler.getTask(
//                    null,
//                    fileManager,
//                    diagnostics,
//                    null,
//                    null,
//                    javaFiles
//            );
//            //выполняем задачу
//            task.call();
//            //выводим ошибки, возникшие в процессе компиляции
//            for (Diagnostic diagnostic : diagnostics.getDiagnostics()) {
//                System.out.format("Error on line %d in %s%n",
//                        diagnostic.getLineNumber(),
//                        diagnostic.getSource());
//            }
//
//            classLoader();
//        }
//    }
//    public static void classLoader() throws Exception {
//        ClassLoader classLoader = System.class.getClassLoader();
//        //получаем путь до нашей папки со сгенерированным кодом
//        URLClassLoader urlClassLoader = new URLClassLoader(
//                new URL[]{Path.of(CraftTweakerConstants.SCRIPTS_DIRECTORY).toUri().toURL()},
//                classLoader);
//        //загружаем наш класс
//        Class<?> helloHabrClass = urlClassLoader.loadClass("hello.Habr");
//        //находим и вызываем метод helloHabr
//        Method methodHelloHabr = helloHabrClass.getMethod("helloHabr");
//        //в параметре передается ссылка на экземпляр класса для вызова метода
//        //либо null при вызове статического метода
//        methodHelloHabr.invoke(null);
//    }
}
