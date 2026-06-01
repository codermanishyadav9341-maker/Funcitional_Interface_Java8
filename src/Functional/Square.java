package Functional;

import java.util.Scanner;
@FunctionalInterface
public interface Square {
    void display(int side);
}

class Result2 implements Square{

    @Override
    public void display(int side){
        System.out.println("Area of Square:- " +side*side);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result2 r2 = new Result2();

        System.out.print("Enter Side:- ");
        int side = scan.nextInt();

        r2.display(side);


        scan.close();

    }
}