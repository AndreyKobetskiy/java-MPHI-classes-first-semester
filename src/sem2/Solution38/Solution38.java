package sem2.Solution38;

import java.io.CharConversionException;
import java.io.IOException;
import java.nio.file.FileSystemException;

public class Solution38 {
    public static StatelessBean BEAN = new StatelessBean();

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            try {
                handleExceptions();
            } catch (Exception e) {
                System.out.println("This have been thrown into main: " + e);
            }
        }

    }

    public static void handleExceptions() throws IOException {
        try {
            BEAN.methodThrowExceptions();
        } catch (IOException e) {
            BEAN.log(e);
            if (e instanceof FileSystemException) throw e;
        }
    }

    public static class StatelessBean {
        public void log(Exception exception) {
            System.out.println(exception.getMessage() + ", " + exception.getClass().getSimpleName());
        }

        public void methodThrowExceptions() throws CharConversionException, FileSystemException, IOException {
            int i = (int) (Math.random() * 3);
            if (i == 0) {
                throw new CharConversionException();
            } else if (i == 1) {
                throw new FileSystemException("");
            } else if (i == 2) {
                throw new IOException();
            }
        }
    }
}
