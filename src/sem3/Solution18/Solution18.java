package sem3.Solution18;

public class Solution18 {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};
        Pair<Integer, Integer> result = getMinimumAndMaximum(data);
        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }
    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        Pair<Integer, Integer> ans = new Pair<>(inputArray[0],inputArray[0]);
        for (int i : inputArray){
            ans.x = Math.min(ans.x, i);
            ans.y = Math.max(ans.y, i);
        }
        return ans;
    }
    public static class Pair<X, Y> {
        public X x;
        public Y y;
        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
