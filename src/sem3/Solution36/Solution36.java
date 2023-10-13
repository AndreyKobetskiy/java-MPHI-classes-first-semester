package sem3.Solution36;

public class Solution36 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Mouse mouse = new Mouse();
        mouse.move();
        cat.eat(mouse);
        dog.eat(cat);
        dog.move();
    }
    //может двигаться
    public interface Movable {
        void move();
    }
    //может быть съеден
    public interface Edible {
        void beEaten();
    }
    //может кого-нибудь съесть
    public interface Eat {
        void eat(Edible animal);
    }
    public static class Cat implements Movable, Edible, Eat{
        @Override
        public void move() {
            System.out.println("Cat moves");
        }

        public void eat(Edible animal) {
            System.out.println("Cat eats " + animal);
            animal.beEaten();
        }

        @Override
        public void beEaten() {
            System.out.println("Cat is eaten");
        }
    }

    public static class Dog implements Movable, Eat{
        @Override
        public void move() {
            System.out.println("Dog moves");
        }
        public void eat(Edible animal) {
            System.out.println("Dog eats " + animal);
            animal.beEaten();
        }
    }

    public static class Mouse implements Movable, Edible{
        @Override
        public void move() {
            System.out.println("Mouse moves");
        }
        public void beEaten() {
            System.out.println("Mouse is eaten");
        }
    }
}
