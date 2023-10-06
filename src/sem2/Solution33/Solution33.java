package sem2.Solution33;

public class Solution33 {
    public static void main(String[] args) {
        log("In main method");
        method1();
    }
    public static void method1(){
        log("abra-cadabra");
    }
    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        System.out.print(stackTraceElements[2].getClassName());
        // stackTraceElements
        // 0-getStackTrace;
        // 1-log
        // 2 -place of log's staring
        for (int i = stackTraceElements.length - 1; i >= 2; i--)
            System.out.print(": " + stackTraceElements[i].getMethodName());
        System.out.println(": " + s);

    }
}
