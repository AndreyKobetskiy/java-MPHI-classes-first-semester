package sem1;

public class Solution0L13 {
    public static void main(final String[] args) {
        ImaginaryFriend imaginaryFriend1 = new ImaginaryFriend("Guss-Lebyad");
        ImaginaryFriend imaginaryFriend2 = new ImaginaryFriend("Kashey Bessmertniy", 2147483647);
        ImaginaryFriend imaginaryFriend3 = new ImaginaryFriend("Pechka-Matushka", 69, "construct");
        System.out.println(imaginaryFriend1.name);
        System.out.println(imaginaryFriend2.name + "; " + imaginaryFriend2.age + " years old");
        System.out.println(imaginaryFriend3.name + "; " + imaginaryFriend3.age
                + " since construction; gender:" + imaginaryFriend3.gender);
    }
    public static class ImaginaryFriend {
        String name;
        int age;
        String gender;

        public ImaginaryFriend(String name) {
            this.name = name;
        }

        public ImaginaryFriend(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public ImaginaryFriend(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

    }
}
