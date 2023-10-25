package sem4.Solution10;

public class Solution10 {
    // совсем ничего выводть не получится, потому что println выводит \n,
    // так что просто выведем пустую строку
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - пушистик");
        System.out.println(pet.getName());
    }
    public static class Pet {
        protected String name;
        public Pet() {}
        public final String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
    public static class Cat extends Pet {
        @Override
        public void setName(String name) {
            super.setName("");
        }
    }
}
