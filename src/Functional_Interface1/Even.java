package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Even {
    void even(int num);
}

class Result23 implements Even{

    @Override
    public void even(int num){
        if(num%2 == 0){
            System.out.println(num+ " is even number");
        }
         else{
             System.out.println(num+ " is odd number");
        }
    }

    public static void main(String[] args){
        Even ee = new Result23();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        ee.even(num);
    }
}