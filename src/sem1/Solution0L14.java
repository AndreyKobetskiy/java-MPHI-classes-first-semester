package sem1;

public class Solution0L14 {
    public static void main(final String[] args) {
        Dog dog1 = new Dog("Sharik");
        Dog dog2 = new Dog("Rectengal", 15);
        Dog dog3 = new Dog("Octopus", 16, "purple");
        System.out.println(dog1.name);
        System.out.println(dog2.name + " " + dog2.height);
        System.out.println(dog3.name + " " + dog3.height + " " + dog3.color);
    }

    public static class Dog {
        String name;
        int height;
        String color;

        public Dog(String name) {
            this.name = name;
        }

        public Dog(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public Dog(String name, int height, String color) {
            this.name = name;
            this.height = height;
            this.color = color;
        }

    }
}
