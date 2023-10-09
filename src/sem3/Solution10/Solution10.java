package sem3.Solution10;

public class Solution10 {
    public static void main(String[] args) {
        Cat c = new Cat("BARS", 88, 88);
        System.out.println(c.getName() + " age: " + c.getAge());
    }
    //Класс Cat был помещен в отдельный фийл,
    //потому что иначе он должен быть статическим (для обращения из статического контекста main),
    //а значит его приватные поля были бы доступны в main.
}

