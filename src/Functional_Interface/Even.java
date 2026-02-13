package Functional_Interface;

import java.util.Scanner;

@FunctionalInterface
public interface Even {

    void even(int n);
}

class Result2 implements Even{
    public void even(int num) {
        if (num % 2 == 0) {
          System.out.println(num+ " is even number");
        }
         else{
             System.out.println(num+ " is odd number");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result2 rr = new Result2();

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        rr.even(num);


    }
}
