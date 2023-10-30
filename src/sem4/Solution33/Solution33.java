package sem4.Solution33;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution33 {
    public static void main(String[] args) {
        ArrayList<Person> alPersons = new ArrayList<>();
        alPersons.add(new Person("Александр", 40));
        alPersons.add(new Person("Иван", 5));
        alPersons.add(new Person("Валентин", 40));
        alPersons.add(new Person("Олег", 40));
        alPersons.add(new Person("Александра", 45));
        alPersons.add(new Person("Михаил", 20));
        alPersons.add(new Person("Дора", 15));
        alPersons.sort(new compPerson());
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
    public static class compPerson implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            /*
            if (o1.age > o2.age) return 1;
            else if (o1.age < o2.age) return -1;
            else return 0;
             */

            return Integer.compare(o1.age, o2.age);
        }
    }
}
