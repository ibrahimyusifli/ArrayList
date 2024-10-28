package Task5;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Ibrahim", 30));
        people.add(new Person("Cuma", 25));
        people.add(new Person("Revan", 20));

        Collections.sort(people);
        for (Person person : people) {
            System.out.println(person);
        }

    }
}
