package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface DoubleNumber {
    void isNum(int num);
}

class Result2 implements DoubleNumber{
    @Override
    public void isNum(int num){
        System.out.println("Double number is:- " +(num*2));
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        Result2 rr = new Result2();
        rr.isNum(num);

        scan.close();
    }
}