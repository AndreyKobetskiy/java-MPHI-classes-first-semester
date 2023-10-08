package sem2.Solution49;

public class Solution49 {
    public static void main(String[] args) {
        int ans = Integer.parseInt(args[0]);
        for (String s : args){
            int t = Integer.parseInt(s);
            ans = Math.min(ans, t);
        }
        System.out.println(ans);
    }
}
