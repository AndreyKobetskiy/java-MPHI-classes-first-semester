package sem1;

public class Solution13 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person);
        person.age = 69;
        System.out.println(person.age);
    }
    public static class Person {
        String name;
        int age, weight, money;
        /*public Person(String name, int age, int weight, int money){
            this.name = name;
            this.age = age;
            this.money = money;
            this.weight = weight;
        }*/
        /*public Person(){
            this.name = "No name";
            this.age = -1;
            this.money = -1;
            this.weight = -1;
        }*/
    }
}
