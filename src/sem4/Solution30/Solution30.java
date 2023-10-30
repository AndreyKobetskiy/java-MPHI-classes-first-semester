package sem4.Solution30;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution30 {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() { //the first exception
        try { //Arithmetic
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //NullPointer
            String a = null;
            char c = a.charAt(0);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //StringIndexOutOfBound
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //FileNotFound
            File file = new File("file.txt");
            FileReader fr = new FileReader(file);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //NumberFormat Exception
            int num = Integer.parseInt ("akki") ;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //ArrayIndexOutOfBounds
            int a[] = new int[5];
            a[6] = 9;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //IO
            Scanner scan = new Scanner("Hello Geek!");
            scan.ioException();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //custom
            throw new MyExeption7();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //custom
            throw new MyExeption8();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //custom
            throw new MyExeption9();
        } catch (Exception e) {
            exceptions.add(e);
        }
        try { //custom
            throw new MyExeption10();
        } catch (Exception e) {
            exceptions.add(e);
        }

    }
    static class MyExeption7 extends Exception{}
    static class MyExeption8 extends Exception{}
    static class MyExeption9 extends Exception{}
    static class MyExeption10 extends Exception{}
}
