package Task4;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ibrahim");
        arrayList.add("Ugur");
        arrayList.add("Revan");
        arrayList.add("Cuma");

        System.out.println("Foor loop:");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        System.out.println("Foor-each loop:");
        for (String students : arrayList) {
            System.out.println(students);
        }

        System.out.println("Iterator:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
