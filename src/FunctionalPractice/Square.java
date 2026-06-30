package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface Square {
    void square(int num);
}

class Result1 implements Square{
    @Override
    public void square(int num){
       System.out.println("Square number is:- " +(num*num));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        Result1 rr = new Result1();
        rr.square(num);
    }
}
