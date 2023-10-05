package sem1;

public class Solution14 {
    public static void main(String[] args) {
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
        System.out.println( man + " " + woman.husband );
        System.out.println( woman + " " + man.wife );
    }
    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }
    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }

}
