import stdlib.Exception;
import mods.ctjl.java.lang.ExecutionException;
import mods.ctjl.java.lang.InterruptedException;

var async_1 = async.supplyAsync(() => {
  var i = 0;
  println("Async 1 Start");
  while(i < 2000){
    println(i);
    i++;
  }
  return 1;
});

var async_2 = async.runAsync(() => {
  var i = 0;
  println("Async 2 Start");
  while(i < 2000){
    println(i);
    i++;
  }
});

try {
  async_1.getValue();
  println("Async 1 End");
} catch ex as ExecutionException {
  println(ex.toString());
} catch ex as InterruptedException {
  println(ex.toString());
}

try {
  async_2.getValue();
  println("Async 2 End");
} catch ex as Exception {
  println("Some Error");
  println(ex.toString());
}