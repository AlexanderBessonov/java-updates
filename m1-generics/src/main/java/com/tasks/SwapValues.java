package com.tasks;

import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {

        Integer[] a = {1,2,3,4};
        swap(a,1,2);
        System.out.println(Arrays.toString(a));

    }
    private static <T> void swap(T[] a,int i , int j){
      //  private static void swap(Integer[] a,int i , int j){
       // Integer temp = a[i];
       T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
