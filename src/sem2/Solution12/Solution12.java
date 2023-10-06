package sem2.Solution12;

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args){
        notMain();
        notMain();
    }
    public static void notMain(){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];
        array[0] = scanner.nextInt();
        int mx = array[0];
        int mn = array[0];

        for (int i = 1; i < 20; i++){
            array[i] = scanner.nextInt();
            mx = Math.max(mx, array[i]);
            mn = Math.min(mn, array[i]);
        }

        System.out.println(mx + " " + mn);
    }
}
