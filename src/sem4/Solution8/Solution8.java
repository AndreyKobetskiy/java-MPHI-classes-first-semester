package sem4.Solution8;

public class Solution8 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        System.out.println(pet.getName());
    }
    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }
    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Я - кот";
        }
    }
}
