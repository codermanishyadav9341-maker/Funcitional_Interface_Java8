package Functional_Interface;

import java.util.Scanner;

@FunctionalInterface
public interface Odd {
    void odd(int num);
}

class Result3 implements Odd{
    public void odd(int num){
        if(num%2 != 0){
            System.out.println(num+ " is Odd number");
        }
         else{
             System.out.println(num+ " is even number");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Result3 rr = new Result3();

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        rr.odd(num);
    }
}
