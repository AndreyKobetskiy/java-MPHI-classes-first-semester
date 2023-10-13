package sem3.Solution25;
// I assume that run means ability to move on land
public class Solution25 {
    public static void main(String[] args) {
        new Penguin().run();
    }
    public interface CanFly {
        public void fly();
    }
    public interface CanRun {
        public void run();
    }
    public interface CanSwim {
        public void swim();
    }
    public static class Duck implements CanFly, CanRun, CanSwim{
        @Override
        public void fly() {System.out.println("krya-krya-f");}

        @Override
        public void run() {System.out.println("krya-krya-r");}

        @Override
        public void swim() {System.out.println("krya-krya-s");}
    }
    public static class Penguin implements CanRun, CanSwim {
        @Override
        public void swim() {System.out.println("ping-ping-win-s");}

        @Override
        public void run() {System.out.println("ping-ping-win-r");}
    }
    public static class Toad implements CanRun {
        @Override
        public void run() {System.out.println("kwa-kwa-r");}
    }
}
