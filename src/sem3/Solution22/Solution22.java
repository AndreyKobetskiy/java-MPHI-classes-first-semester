package sem3.Solution22;

public class Solution22 {
    public static void main(String[] args) {
        new Dog().eat();
        new Duck().fly();
        new Airplane().move();
        new Airplane().fly();
        new Car().move();
    }

    public interface CanFly extends CanMove {
        public void fly();
    }

    public interface CanMove {
        public void move();

    }

    public interface CanEat {
        public void eat();
    }

    public static class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("dog is running");
        }

        @Override
        public void eat() {
            System.out.println("dog is eating");
        }
    }

    public static class Duck implements CanFly, CanEat {
        @Override
        public void fly() {
            System.out.println("duck is flying");
        }

        @Override
        public void move() {
            fly();
        }

        @Override
        public void eat() {
            System.out.println("duck is eating");
        }
    }

    public static class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("car is moving");
        }
    }

    public static class Airplane implements CanFly {
        @Override
        public void fly() {
            System.out.println("plane in flying");
        }

        @Override
        public void move() {
            fly();
        }
    }
}
