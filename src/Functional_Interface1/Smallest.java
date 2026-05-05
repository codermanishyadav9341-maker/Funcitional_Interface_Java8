package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Smallest {
    int minImpl(int[] arr);
}

class Result72 implements Smallest{

    @Override
    public int minImpl(int[] arr){
        int min = arr[0];

        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }

        for(int i : arr){
            if(i < min)
                min = i;
        }
        return min;
    }

    public static void main(String[] args){
        Smallest sm = new Result72();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];


        System.out.println("Enter Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++){
            System.out.print(arr[i] +" ");
        }

        System.out.println("\nSmallest number in Array:- " +sm.minImpl(arr));

    }
}