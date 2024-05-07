import stdlib.Exception;
import mods.ctjl.java.io.BufferedReader;
import mods.ctjl.java.io.FileReader;
import mods.ctjl.java.nio.file.Path;
import mods.ctjl.java.io.IOHelper;
import mods.ctjl.api.CTJLConstants;
import mods.ctjl.java.io.FileNotFoundException;
import mods.ctjl.java.nio.file.Files;
import mods.ctjl.java.io.BufferedReader;
import mods.ctjl.java.io.BufferedWriter;
import mods.ctjl.java.io.FileWriter;
import mods.ctjl.java.io.PrintWriter;

import stdlib.List;

var fileRead = IOHelper.of(CTJLConstants.SCRIPTS_DIRECTORY).resolve("files").resolve("myText.txt");
var fileWrite = IOHelper.of(CTJLConstants.SCRIPTS_DIRECTORY).resolve("files").resolve("myTextWrite.txt");

try{

  var lines = Files.readAllLines(fileRead);
  for line in lines{
    println(line);
  }

} catch ex as FileNotFoundException{
  println(ex.toString());
} catch ex as Exception {
  println(ex.toString());
}


try{
  var br = new BufferedReader(new FileReader(fileRead.toString()));
  var lines as List<string> = br.lines().toList() as List<string>;
  for line in lines{
    println(line);
  }

} catch ex as FileNotFoundException{
  println(ex.toString());
} catch ex as Exception {
  println(ex.toString());
}

try{
  var bw = new BufferedWriter(new FileWriter(fileWrite.toString()));
  bw.write("Test Text");
  bw.flush();
} catch ex as FileNotFoundException{
  println(ex.toString());
} catch ex as Exception {
  println(ex.toString());
}

try{
  var bw = new PrintWriter(fileWrite.toString());
  bw.println("new Line");
  bw.close();
} catch ex as FileNotFoundException{
  println(ex.toString());
} catch ex as Exception {
  println(ex.toString());
}

try{
  Files.writeString(fileWrite, "Test Text", <constant:standard/open/option:append>);
} catch ex as FileNotFoundException{
  println(ex.toString());
} catch ex as Exception {
  println(ex.toString());
}

// try {
//     SDMJavaCompiler.compileJavaFile("hello/Habr.java");
//     SDMJavaCompiler.loadJavaFile("", "hello.Habr", "helloHabr");
// } catch ex as Exception {
//     println(ex.toString());
// }