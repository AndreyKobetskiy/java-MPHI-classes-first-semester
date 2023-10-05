package sem1;

public class Solution16 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";
        System.out.println(dog1.name + " " + dog2.name + " " + dog3.name);

    }
    public static class Dog {
        public String name;
    }
}
