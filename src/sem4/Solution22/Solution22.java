package sem4.Solution22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution22 {
    public static void doWork(Person person){
        person.saySmth();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = reader.readLine()) != null){
            Person person = Person.getPersonByKey(input);
            if (person == null) break;
            doWork(person);
        }
    }
}
