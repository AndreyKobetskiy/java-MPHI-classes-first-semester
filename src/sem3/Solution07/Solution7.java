package sem3.Solution07;

public class Solution7 {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.name = "VASILIY";
        Chief c1 = new Chief();
        c1.name = "KEEF";
        Secretary s1 = new Secretary();
        s1.name = "GREGOR";
        System.out.println(m1 + ". Employment: " + (m1 instanceof Employee));
        System.out.println(c1 + ". Employment: " + (c1 instanceof Employee));
        System.out.println(s1 + ". Employment: " + (s1 instanceof Employee));

    }
    public static class Manager extends Employee {
        public Manager() {}
    }
    public static class Chief extends Employee {
        public Chief() {}
    }
    public static class Employee {
        public String name;
        @Override
        public String toString() {
            return (this.getClass()+ ": " + this.name);
        }

    }
    public static class Secretary extends Employee {
        public Secretary() {}
    }
}

