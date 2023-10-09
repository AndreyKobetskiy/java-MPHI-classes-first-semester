package sem3.Solution09;

public class Solution9 {
    public static void main(String[] args) {
        Cat c = new Cat("BARSIK", 99, 99);
        System.out.println(c.getName());
        c.setName("DOg");
        System.out.println(c.getName());

    }

    //Класс Cat был помещен в отдельный фийл,
    //потому что иначе он должен быть статическим(для обращения из статического контекста main),
    //а значит его приватные поля были бы доступны в main.
    //Изменения:
    //public String name;   ->    private String name;
    //public int age;       ->    private int age;

}
