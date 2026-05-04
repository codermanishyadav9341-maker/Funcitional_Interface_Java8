package Functional_Interface1;

import java.util.Scanner;

@FunctionalInterface
public interface Square {
    void square(int side);
}

class Result24 implements Square{

    @Override
    public void square(int side){
        if(side >= 0){
            System.out.println("Area of Square:- " +(side*side));
        }
         else{
             System.out.println("Side cannot be negative");
        }
    }

    public static void main(String[] args){
        Square ss = new Result24();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Side:- ");
        int side = scan.nextInt();

        ss.square(side);

        scan.close();
    }
}
