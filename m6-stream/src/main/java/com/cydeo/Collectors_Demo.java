package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;
import com.cydeo.task.Type;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Collectors_Demo {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(3,4,5,6,6,7);

        //toCollection(Supplier) : is used to create a collection using Collector
        System.out.println(" List");
        List<Integer> numberList = numbers.stream()
                .filter(x-> x%2 ==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);

        System.out.println(" Set ");
        Set<Integer> numberSet =  numbers.stream()
                .filter(x-> x%2 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);

        System.out.println(" toList() ");      // return a Collector interface that
        List <Integer> numberList2 = numbers.stream()
                .filter(x-> x%2 ==0)
                .collect(Collectors.toList());
        System.out.println(numberList2);

        System.out.println(" toSet() ");  //returns a Collector interface that gathers
                                          // the input data into a new map
       Set<Integer> numberSet2 = numbers.stream()
                .filter(x-> x%2 ==0)
                .collect(Collectors.toSet());
        System.out.println(numberSet2);

        System.out.println(" toMap(Function,Function ");// : returns a Collector interface that gathers
                                                       // the input data into a new map
        Map<String,Integer> dishMap = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        //summingInt(ToIntFunction) returns a Collector that produces the sum of a Integer-valued func
        Integer sum = DishData.getAll().stream()
               .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);

        //counting() : returns a Collector that counts the number of the elements
        Long evenCount = numbers.stream()
                .filter(x-> x % 2 == 0)
                .collect(Collectors.counting());
        System.out.println(evenCount);


        System.out.println("averagingInt(ToIntFunction");//returns the average of integers passed values
        Double calorieAverage = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(calorieAverage);

        System.out.println("Joining");//is used to join varius elements of a character or
                                        // string array into a single object
        List<String> courses = Arrays.asList("Java","JS","TS");
        String str = courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);

        System.out.println("partitioningBy()");// is used to partition [раздел] a stream of object
                                                  // (or set of elements) based on given predicate.
       Map<Boolean, List <Dish>> veggieDish = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(veggieDish);

        System.out.println("groupingBy");//is used to grouping objects by some property and storing
                                          // results in a Map instance
        Map<Type,List<Dish>> dishType = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);

    }
}
