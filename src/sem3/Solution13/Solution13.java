package sem3.Solution13;

public class Solution13 {
    public static void main(String[] args) {
        System.out.println("human is fish: " + (new Human() instanceof Fish));
    }
}
class Fish {}
 class Animal extends Fish{}
 class Ape extends Animal{}
 class Human extends Ape{}