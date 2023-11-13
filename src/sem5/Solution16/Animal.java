package sem5.Solution16;


public abstract class Animal {
    private final String name;
    private final Color color;
    private int age;
    public Animal(String name, Color
            color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public Color getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }
}

