package sem2.Solution41;

public class Solution41 {
    public static void main(String[] args) {
        try {
            throwMyException();
        }catch (MyException e){ System.out.println(e);}
        try {
            throwMyException2();
        }catch (MyException2 e){ System.out.println(e);}
        try {
            throwMyException3();
        }catch (MyException3 e){ System.out.println(e);}
        try {
            throwMyException4();
        }catch (MyException4 e){ System.out.println(e);}

    }

    public static void throwMyException() throws MyException {
        throw new MyException();
    }

    public static void throwMyException2() throws MyException2 {
        throw new MyException2();
    }

    public static void throwMyException3() throws MyException3 {
        throw new MyException3();
    }

    public static void throwMyException4() throws MyException4 {
        throw new MyException4();
    }

    static class MyException extends Exception {
        public MyException(String errorMessage) {
            super(errorMessage);
        }

        public MyException() {
            super("MyException");
        }
    }

    static class MyException2 extends Exception {
        public MyException2() {
            super("MyException2");
        }
    }

    static class MyException3 extends RuntimeException {
        public MyException3() {
            super("MyException3");
        }
    }

    static class MyException4 extends RuntimeException {
        public MyException4() {
            super("MyException4");
        }
    }
}
