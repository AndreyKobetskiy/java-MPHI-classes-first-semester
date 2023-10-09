package sem3.Solution08;

public class Solution8 {
    public static void main(String[] args) {
        System.out.println("IT is Worker: " + (new IT() instanceof Worker));
        System.out.println("Clerk is Worker: " + (new Clerk() instanceof Worker));
        System.out.println("CTO is Worker: " + (new CTO() instanceof Worker));
        System.out.println("CTO is IT: " + (new CTO() instanceof IT));
        System.out.println("HR is Clerk: " + (new HR() instanceof Clerk));
        System.out.println("HR is Worker: " + (new HR() instanceof Worker));

    }
    public static class Worker {
        public Worker() {}
    }
    public static class Clerk extends Worker {}
    public static class IT extends Worker {}
    public static class Programmer extends IT {}
    public static class ProjectManager extends IT {}
    public static class CTO extends IT {}
    public static class OfficeManager extends Clerk{}
    public static class HR extends Clerk {}
    public static class Cleaner extends Clerk {}
}
