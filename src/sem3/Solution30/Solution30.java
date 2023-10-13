package sem3.Solution30;

public class Solution30 {
    public static void main(String[] args) {
        System.out.println(Dream.HOBBY.toString());
        System.out.println(new Hobby().toString());
    }
    static class Desire {
    }
    interface Dream {
        static Hobby HOBBY = new Hobby();
    }
    static class Hobby extends Desire implements Dream {
        static int INDEX = 1;
        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }
}
