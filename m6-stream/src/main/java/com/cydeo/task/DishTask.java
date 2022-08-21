package com.cydeo.task;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DishTask {
    public static void main(String[] args) {

        //1)Print all dish's name that has less than 400 calories

        //2)Print the length of the name of each dish

        //3)Print three high caloric dish name (>300)

        //4)Print all dish name that are below 400 calories in sorted


        System.out.println("#1");//1)Print all dish's name that has less than 400 calories
        DishData.getAll().stream()
                .filter(p->p.getCalories()<40)
              //  .map(Dish->            Dish.getName().length())
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("#2");//2)Print the length of the name of each dish
        DishData.getAll().stream()
              //  .map(str->str.getName().length())
                //.map(dish->dish.length())
               // .map(dish -> dish.getName().length())//**
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("#3");//Print three high caloric dish name (>300)
        DishData.getAll().stream()
                .filter(p->p.getCalories()>300)
                //.skip(3)
                .limit(3)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("#4"); //4)Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()

                .filter(p->p.getCalories()<400)
                .map(Dish::getName)
                .sorted(String::compareTo)
                .forEach(System.out::println);
        System.out.println("#4.1"); //4)Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()

                .filter(p->p.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories))
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("#4.2"); //4)Print all dish name that are below 400 calories in sorted
        DishData.getAll().stream()

                .filter(p->p.getCalories()<400)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);

       Stream<Dish> dishStream = DishData.getAll().stream();//
        // or
               // dishStream.map()//+++



    }

    }

