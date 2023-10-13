package sem3.Solution26;

public class Solution26 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }
    public static interface Businessman {
        public void workHard();
    }
    public abstract static class ITBusinessman implements Businessman{
        @Override
        public void workHard() {
            System.out.println("hard work");
        }
    }
    public static class CTO extends ITBusinessman implements Businessman {}
}
