package Task9;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        ArrayList<Integer> sira1 = new ArrayList<>();
        sira1.add(1);
        sira1.add(2);
        sira1.add(3);

        ArrayList<Integer> sira2 = new ArrayList<>();
        sira2.add(11);
        sira2.add(12);
        sira2.add(13);

        arrayList.add(sira1);
        arrayList.add(sira2);

        for (ArrayList<Integer> sira : arrayList) {
            for (Integer num : sira) {
                System.out.print(num + " ");
            }
            System.out.println();
        }


    }
}
