package com.cydeo;

import com.cydeo.task.Dish;
import com.cydeo.task.DishData;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class FindingMatching {

    public static void main(String[] args) {

//                            new Dish("pizza",true,550,Type.OTHER),
//                            new Dish("prawns",false,300,Type.FISH),
    // ALL MATCH
        System.out.println("ALL MATCH");//Соответствие
    boolean isHealthy = DishData.getAll().stream().allMatch(dish->dish.getCalories()<1000);
        System.out.println(isHealthy);
//**********************************************
        System.out.println("ANY MATCH");//Соответствие
      DishData.getAll().stream().anyMatch(Dish::isVegetarian );
        System.out.println("The menu is vegetarian friendly");
///*****************************************************************
        System.out.println("NONE MATCH");//Соответствие
        boolean isHealthy2 =DishData.getAll().stream().noneMatch(dish -> dish.getCalories()>=1000);
        System.out.println(isHealthy2);

        System.out.println("FIND ANY");//*****************
        Optional<Dish> dish = DishData.getAll().stream().filter(Dish::isVegetarian).findAny();
        System.out.println(dish);
        System.out.println(dish.get());

        System.out.println("FIND FIRST");//*****************
        Optional<Dish> dish0 = DishData.getAll().stream().filter(Dish::isVegetarian).findFirst();        System.out.println(dish);



        System.out.println("PARALLEL STREAMS (Async)");//**************
        System.out.println(IntStream.range(0,100).parallel().findAny());
        System.out.println(IntStream.range(0,100).parallel().findFirst());

        List<String> list1 = Arrays.asList("Jhonny","David","Jack","Duke",
                "Jill","Dany","Julia","Jenish","Divya");
        List<String> list2 = Arrays.asList("Jhonny","David","Jack","Duke",
                "Jill","Dany","Julia","Jenish","Divya");

       Optional<String> findFirst = list1.parallelStream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny =  list2.parallelStream().filter(s->s.startsWith("J")).findAny();
        System.out.println(findFirst.get());//David-1
        System.out.println(findAny.get());//Jill-3

        Optional<String> findFirst2 = list1.stream().filter(s->s.startsWith("D")).findFirst();
        Optional<String> findAny2 =  list2.stream().filter(s->s.startsWith("J")).findAny();
        System.out.println(findFirst2.get());//David-1
        System.out.println(findAny2.get());//Jhonny

        System.out.println(" MIN ");//**********
        Optional<Dish> dMin = DishData.getAll().stream().min(Comparator.comparing(Dish::getCalories));
        System.out.println(dMin.get());

        System.out.println(" MAX ");//***********
        Optional<Dish> dMax = DishData.getAll().stream().max(Comparator.comparing(Dish::getCalories));
        System.out.println(dMax);

    }
}
