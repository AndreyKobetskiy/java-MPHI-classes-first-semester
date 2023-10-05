package sem1;

public class Cat25 {
        private String name = "безымянный кот";

        public void setName(String name) {
            this.name = name;
        }
        public static void main(String[] args) {
            Cat25 cat = new Cat25();
            cat.setName("Жужик");
            System.out.println(cat.name);
        }
    }

