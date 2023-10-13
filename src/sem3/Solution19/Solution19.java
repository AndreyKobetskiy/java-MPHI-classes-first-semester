package sem3.Solution19;

public class Solution19 {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }
    public static void printObjectType(Object o) {
        System.out.println(o.getClass());
    }
    public static class Cat {}
    public static class Dog {}
    public static class Bird {}
    public static class Lamp {}
}
