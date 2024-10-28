package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ibrahim");
        arrayList.add("Ugur");
        arrayList.add("Revan");
        arrayList.add("Cuma");

        System.out.println(arrayList.contains("Yusif"));

        System.out.println(arrayList.indexOf("Revan"));

        arrayList.set(2,"Metin");
        System.out.println("ArrayList :" + arrayList);

        System.out.println(arrayList.isEmpty());

        arrayList.clear();
        System.out.println(arrayList.isEmpty());

    }
}
