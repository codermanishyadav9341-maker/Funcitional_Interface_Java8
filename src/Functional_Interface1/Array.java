package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Array {
    void print(int[] arr);
}

class Result58 implements Array{

    @Override
    public void print(int[] arr){
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }

    public static void main(String[] args){
        Array ar = new Result58();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        int[] arr = new int[size];


        for(int i = 0; i<size; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Array elements:- ");
        ar.print(arr);


        scan.close();

    }
}