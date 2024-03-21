package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(9);
        list.add(5);
        list.add(4);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        // reverseOrder is comparator in java which is used to define the logic of sorting
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

    }
}
