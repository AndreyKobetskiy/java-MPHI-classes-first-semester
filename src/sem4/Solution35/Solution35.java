package sem4.Solution35;



import java.util.ArrayList;
import java.util.Comparator;

public class Solution35 {
    public static void main(String[] args) {
        ArrayList<Person> alPersons = new ArrayList<>();
        alPersons.add(new Person("Александр", 40));
        alPersons.add(new Person("Иван", 5));
        alPersons.add(new Person("Валентин", 40));
        alPersons.add(new Person("Олег", 40));
        alPersons.add(new Person("Александра", 45));
        alPersons.add(new Person("Михаил", 20));
        alPersons.add(new Person("Дора", 15));
        alPersons.sort(Comparator.comparingInt(Person::getAge));
        for (Person person : alPersons){
            System.out.println(person.getAge() + " " + person.getName());
        }

    }
    public static class Person {
        private final String name;
        private final int age;
        public Person(String name, int age) {
            this.age = age;
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
