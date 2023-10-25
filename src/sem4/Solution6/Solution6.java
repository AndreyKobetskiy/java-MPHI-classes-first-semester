package sem4.Solution6;

public class Solution6 {
    public static void main(String[] args) {
        System.out.println(new Cow().getName());
    }
    public static abstract class Animal {
        public abstract String getName();
    }
    public static class Cow extends Animal{
        private String name = "?COW?";

        @Override
        public String getName() {
            return name;
        }
    }
}
