package sem3.Solution14;

public class Solution14 {
    public static void main(String[] args) {
        System.out.println("dog is animal: " + (new Dog() instanceof Animal));
        System.out.println("dog is carnivore: " + (new Dog() instanceof Carnivore));
        System.out.println("pig is animal: " + (new Dog() instanceof Animal));
    }
}

class Carnivore extends Animal {
}

class Cow extends Animal {
}

class Dog extends Carnivore {
}

class Pig extends Animal {
}

class Animal {
}