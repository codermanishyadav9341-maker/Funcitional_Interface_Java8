package Functional_Interface1;

import java.util.Scanner;

@FunctionalInterface
public interface Largest {
    int find(int[] arr);
}

class Result71 implements Largest{

    @Override
    public int find(int[] arr){

        if(arr == null || arr.length == 0){
           throw new IllegalArgumentException("Array is empty");
        }
        int max = arr[0];
        for(int i : arr){
            if(i > max)
                max = i;
        }
         return max;
    }

    public static void main(String[] args){
        Largest lr = new Result71();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Array elements:- ");
        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements:- ");
        for(int i = 0; i<size; i++) {

            System.out.print(arr[i] + " ");
        }


        System.out.println("\nMaximum number is:- " +lr.find(arr));

        scan.close();

    }
}