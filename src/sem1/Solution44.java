package sem1;

public class Solution44 {
    public static void main(String[] args){
        int i = 1, j;
        while (i <= 10){
            j = 1;
            while (j <= 10){
                System.out.print(i * j + " ");
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
