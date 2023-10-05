package sem1;

import java.util.Objects;
import java.util.Scanner;

public class Solution40 {
    public static void check(String name, String eman){
        if (Objects.equals(name, eman)){
            System.out.println("Имена идентичны");
        } else if (name.length() == eman.length()) {
            System.out.println("Длины имен равны");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name;
        String eman;
        for (int i = 0; i < 3; i++){

             name = scanner.next();
             eman = scanner.next();
             check(name, eman);
        }


    }
}
