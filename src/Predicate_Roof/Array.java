package Predicate_Roof;

import java.util.Scanner;
import java.util.function.Predicate;

public class Array {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // All Positive number

        Predicate<int[]> isPositive = arr->{
            for(int num : arr){
                if(num <= 0)
                    return false;
            }
            return true;
        };


        // All Even number
        Predicate<int[]> isEven = arr ->{
            for(int num : arr){
                if(num%2 != 0)
                    return false;
            }
            return true;
        };


        // Sorted

        Predicate<int[]> isSorted = arr ->{
          for(int i = 0; i<arr.length; i++){
              if(arr[i] < arr.length-1)
                  return false;
          }
          return true;
        };



        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" ");
        }


        System.out.println("\n-------------=:Result:=----------------");
        System.out.println("Is Positive check:- " +isPositive.test(arr));
        System.out.println("Is even number:- " +isEven.test(arr));
        System.out.println("Is Sorted check:- " +isSorted.test(arr));

    }
}
