package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 11;
        array[1] = 12;
        array[2] = 13;
        array[3] = 14;
        array[4] = 15;

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(21);
        arrayList.add(22);

        System.out.println("Size of Array :" + array.length);
        System.out.println("Size of Arraylist :" + arrayList.size());

    }
}
