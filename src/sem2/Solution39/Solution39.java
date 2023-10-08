package sem2.Solution39;

import java.io.IOException;
import java.rmi.RemoteException;

public class Solution39 {
    public static void main(String[] args) {
        /*
        Все эти исключения не унаследованы от RuntimeException
        System.out.println((new IOException() instanceof RuntimeException));
        System.out.println((new NoSuchFieldException() instanceof RuntimeException));
        System.out.println((new RemoteException() instanceof RuntimeException));
        */
        handleExceptions(new Solution39());
    }
    public static void handleExceptions(Solution39 obj) {
        try {
            obj.method1();
            obj.method2();
            obj.method3();
        }catch (Exception e){
            if (e instanceof IOException){
                if (e instanceof RemoteException){
                    System.out.println("RE: " + e);
                }
                else System.out.println("IOE: " + e);
            }
            else if (e instanceof NoSuchFieldException){
                System.out.println("NSFE: " + e);
            }
            else System.out.println("Unexpected exception: " + e);
        }

    }
    public void method1() throws IOException {
        throw new IOException();
    }
    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }
    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
