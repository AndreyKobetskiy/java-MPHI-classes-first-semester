package sem1;

public class Solution18 {
    public static void main(String[] args) {
        Woman woman = new Woman();
        Cat cat = new Cat();
        cat.owner = woman;
        Dog dog = new Dog();
        dog.owner = woman;
        Fish fish = new Fish();
        fish.owner = woman;
        System.out.println(cat.owner == dog.owner &&  fish.owner == dog.owner);
    }
    public static class Cat {
        public Woman owner;
    }
    public static class Dog {
        public Woman owner;
    }
    public static class Fish {
        public Woman owner;
    }
    public static class Woman {
    }
}
