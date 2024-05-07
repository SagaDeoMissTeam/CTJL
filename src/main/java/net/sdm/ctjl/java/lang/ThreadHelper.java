package net.sdm.ctjl.java.lang;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import org.openzen.zencode.java.ZenCodeGlobals;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@ZenCodeType.Name("mods.ctjl.java.lang.ThreadHelper")
public class ThreadHelper {

    @ZenCodeGlobals.Global("thread")
    public static final ThreadHelper THREAD = new ThreadHelper();

    @ZenCodeType.Method
    public Thread createTread(Runnable runnable){
        return new Thread(runnable);
    }

    @ZenCodeType.Method
    public void createRunThread(Runnable runnable){
        new Thread(runnable).start();
    }


    @ZenCodeType.Method
    @ZenCodeType.Getter("currentThread")
    public Thread currentThread(){
        return Thread.currentThread();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("activeCount")
    public int activeCount(){
        return Thread.activeCount();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("interrupted")
    public boolean interrupted(){
        return Thread.interrupted();
    }
    @ZenCodeType.Method
    public void onSpinWait(){
        Thread.onSpinWait();
    }
    @ZenCodeType.Method
    public void dumpStack(){
        Thread.dumpStack();
    }
    @ZenCodeType.Method
    public void yield(){
        Thread.yield();
    }
    @ZenCodeType.Method
    public void sleep(long millis) throws InterruptedException {
        Thread.sleep(millis);
    }
    @ZenCodeType.Method
    public void sleep(long millis, int nanos) throws InterruptedException {
        Thread.sleep(millis, nanos);
    }
    @ZenCodeType.Method
    public boolean holdsLock(boolean b) throws InterruptedException {
       return Thread.holdsLock(b);
    }
}
