package sem2.Solution50;

public class Solution50 {
    public static void main(String[] args) {
        int[] ans = {0, 0};
        for (int i = 0; i < args.length; i++){
            int t = Integer.parseInt(args[i]);
            ans[i%2] += t;
        }
        System.out.println("Even sum: " + ans[0]);
        System.out.println("Odd sum: " + ans[1]);
    }
}
