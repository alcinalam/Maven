package com.bootcamp.demo2403;

import java.util.Arrays;
import java.util.List;
import lombok.ToString;


@ToString
public class Calculator { 

  
    public static int sum(int x , int y) {
      return x + y;
    }
  
    public static int subtract (int x, int y) {
      return x - y; 
    }

    public static void print (String name) {
      System.out.println();
    }

    public static void sort (int []arr) {
      int temp = 0;
      for (int i = 0; i < arr.length-1; i++) {
        for (int j = 0; j < arr.length -i-1; j++){
          if (arr[j] > arr [j + 1]){
            temp = arr[j];
            arr[j] = arr [j + 1];
            arr[j + 1] = temp;
          }
        }
      }
    }





}

