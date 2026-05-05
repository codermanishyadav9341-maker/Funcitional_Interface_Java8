package Functional_Interface1;

import java.util.Scanner;
import java.util.Arrays;
@FunctionalInterface
public interface Sort {
    int[] findImpl(int[] arr);
}

class Result73 implements Sort{

    @Override
    public int[] findImpl(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                  if(arr[i] > arr[j]){
                      int temp = arr[i];
                      arr[i] = arr[j];
                      arr[j] = temp;
                  }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        Sort sm = new Result73();
        Scanner scan = new Scanner(System.in);

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

        int[] sorted = sm.findImpl(arr);

        System.out.println("Sorted Array:- " + Arrays.toString(sorted));

    }
}