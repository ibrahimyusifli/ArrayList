package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(10);
        arrayList.add(11);

        arrayList.remove(2);

        int a = arrayList.get(1);
        System.out.println("Second element:" + a );
        System.out.println(arrayList);

    }
}
