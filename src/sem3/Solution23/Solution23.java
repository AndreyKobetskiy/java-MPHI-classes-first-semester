package sem3.Solution23;

public class Solution23 {
    public static void main(String[] args) {

    }
}
interface CanRun{
    void run();
}
interface CanSwim{
    void swim();
}
abstract class Human implements CanSwim, CanRun{}
