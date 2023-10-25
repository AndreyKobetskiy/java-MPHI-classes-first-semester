package sem4.Solution1;

public class Solution1 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();
        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
        System.out.println(dog);
        System.out.println(cat);
    }
    public static abstract class Pet {
        public abstract Pet getChild();
    }
    public static class Cat extends Pet {
        @Override
        public Cat getChild(){
            return new Cat();
        }
    }
    public static class Dog extends Pet {
         @Override
         public Dog getChild(){
             return new Dog();
         }
    }
}
