package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class StreamOperations$ {
    public static void main(String[] args) {


    List<Integer> list = Arrays.asList(1,2,3,4);

    list.forEach(System.out::println);

        System.out.println("FILTER ");//1
        list.stream()
                .filter(i-> i%2 == 0)
                .forEach(System.out::println);

        System.out.println("DISTINCT");//2
        list.stream()
         //Stream<Integer> str = list.stream()
                .filter(i-> i%2 == 0)
                .distinct();

        System.out.println("LIMIT");//3
        // str.forEach(System.out::print);
      list.stream()
              .filter(i-> i%2 == 0)
              .limit(1)
              .forEach(System.out::println);

        System.out.println("SKIP");//4
        list.stream()
                .filter(i-> i%2 == 0)
                .skip(1)
                .forEach(System.out::println);

        System.out.println("MAP");//5   // (1,2,3,4,5,6)-->[1,2,3,4,5,6]
        list.stream()
                .map(number->number*2)
                .filter(i-> i%3 == 0)
                .forEach(System.out::println);

        System.out.println("flatMAP");// 6 //[[1,2],[3,4],[5,6]]-->[1,2,3,4,5,6,]

  }
}
