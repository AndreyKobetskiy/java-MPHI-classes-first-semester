package sem4.Solution7;

public class Solution7 {
    public static void main(String[] args) {
        System.out.println(new Cat().getChild().getName());
        System.out.println(new Dog().getChild().getName());
    }
    public static abstract class Pet {
        public abstract String getName();
        public abstract Pet getChild();
    }
    public static class Cat extends Pet{
        private String name = "default name";

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Cat getChild() {
            return new Cat();
        }
    }
    public static class Dog extends Pet{
        private String name = "default name";
        @Override
        public String getName() {
            return name;
        }
        @Override
        public Dog getChild() {
            return new Dog();
        }

    }
}

