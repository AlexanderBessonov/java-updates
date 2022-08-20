package com.cydeo;

import com.sun.source.tree.ArrayAccessTree;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 0, 15, 5, 20);

        //Ascending
        Collections.sort(list);
        System.out.println(list);

        //Descending
        Collections.sort(list, new MyComparator());
        System.out.println(list);

        Collections.sort(list, ((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0));

        //Ascending
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);

        //Descending
        list.sort(((o2, o1) -> o1.compareTo(o2)));
        System.out.println(list);

        //Ascending
        list.sort(Integer::compareTo);
        System.out.println(list);

    }
}