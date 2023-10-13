package sem3.Solution15;



public class Solution15 {
    public static void main(String[] args) {
        System.out.println("dog is pet: " + (new Dog() instanceof Pet));
    }
}
 class Pet {}
 class Cat extends Pet{}
 class Car {}
 class Dog extends Pet{}