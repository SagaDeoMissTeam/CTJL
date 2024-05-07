package net.sdm.ctjl.runtime;

import com.blamejared.crafttweaker.api.CraftTweakerConstants;
import com.sun.codemodel.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

public class ClassGenerator {

    public static void generateTestClass() throws JClassAlreadyExistsException, IOException {
        JCodeModel codeModel = new JCodeModel();
        //определяем наш класс Habr в пакете hello
        JDefinedClass testClass = codeModel._class("hello.Habr");

        // определяем метод helloHabr
        JMethod method = testClass.method(JMod.PUBLIC + JMod.STATIC, codeModel.VOID, "helloHabr");

        // в теле метода выводим строку "Hello Habr!"
        method.body().directStatement("System.out.println(\"Hello Habr!\");");

        //собираем модель и пишем пакеты в currentDirectory
        codeModel.build(new File(CraftTweakerConstants.SCRIPTS_DIRECTORY));
    }
}
