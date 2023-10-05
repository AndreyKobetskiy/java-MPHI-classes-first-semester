package sem1;

public class Cat28 {
    private String fullName;
    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }
    public static void main(String[] args) {
        Cat28 cat = new Cat28();
        cat.setName("ca", "at");
        System.out.println(cat.fullName);
    }
}
