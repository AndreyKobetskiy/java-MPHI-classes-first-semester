package sem4.Solution9;

public class Solution9 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");
        System.out.println(pet.getName());
    }
    public static class Pet {
        protected String name;
        public Pet() {}
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            super.setName("Я - кот");
        }
    }
}
