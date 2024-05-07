import mods.ctjl.example.SDMJavaCompiler;
import stdlib.Exception;



try {
    SDMJavaCompiler.compileJavaFile("hello/SClassTest.java");
    SDMJavaCompiler.loadJavaFile("", "hello.SClassTest", "myMethod");
} catch ex as Exception {
    println(ex.toString());
}