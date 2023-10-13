package sem3.Solution11;

public class Solution11 {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);
        System.out.println(cat.isDogNear(dog));
        System.out.println(dog.isCatNear(cat));
    }
}
class Cat {
    private String name;
    private int speed;
    public Cat(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    private String getName() {
        return name;
    }
    public int getSpeed() { // used in Dog.isCatNear
        return speed;
    }
    public boolean isDogNear(Dog dog) {
        return this.speed > dog.getSpeed();
    }
}
class Dog {
    private String name;
    private int speed;
    public Dog(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    private String getName() {
        return name;
    }
    public int getSpeed() { // used in Cat.isDogNear
        return speed;
    }
    public boolean isCatNear(Cat cat) {
        return this.speed > cat.getSpeed();
    }
}
