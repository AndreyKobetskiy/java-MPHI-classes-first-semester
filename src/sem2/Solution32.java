package sem2;

public class Solution32 {
    public static void main(String[] args) {
        int deep = getStackTraceDepth();
    }
    public static int getStackTraceDepth() {
        int ans = Thread.currentThread().getStackTrace().length;
        System.out.println(ans - 1);
        /*
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element:stackTraceElements) {
            System.out.println(element.getMethodName());
        }
        */
        return ans - 1;
    }
}
