package sem3.Solution24;

import java.util.HashMap;
import java.util.Map;

public class Solution24 {
    private static final Map<String, String> classesNames = Map.of(
            "Cat", "Кот",
            "Tiger", "Тигр",
            "Lion", "Лев",
            "Bull", "Бык",
            "Cow", "Корова",
            "Animal", "Животное");
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }
    public static String getObjectType(Object o) {

        return classesNames.get(o.getClass().toString().split("[$]")[1]);
    }
    public static class Cat extends Animal {} //<--Классы наследуются!!
    public static class Tiger extends Cat {}
    public static class Lion extends Cat {}
    public static class Bull extends Animal {}
    public static class Cow extends Animal {}
    public static class Animal {}
}
