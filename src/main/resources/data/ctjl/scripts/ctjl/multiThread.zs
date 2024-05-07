

val tread = thread.createTread(() => {
    var i = 0;
    while (i < 5000){
        println("Thread 1: " + i);
        i++;
    }
});

thread.createRunThread(() => {
    var i = 0;
    while (i < 5000){
        println("Thread 2: " + i);
        i++;
    }
});

tread.start();