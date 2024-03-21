package ARRAYLIST;

import java.util.ArrayList;

public class Operation {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2,14);   //O(n)
        System.out.println(list);
        // Get Operation -O(1)
        int element = list.get(2);
        System.out.println(element);
        // Delete
//        list.remove(2);
//        System.out.println(list);
        list.set(2,10);
        System.out.println(list);
        // Conmtains
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(11));
    }
}
