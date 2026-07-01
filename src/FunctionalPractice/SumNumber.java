package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface SumNumber {
    void printSum(int num1,int num2);
}

class SumImpl implements SumNumber{

    public void printSum(int num1,int num2){
        int result = Math.addExact(num1,num2);
        System.out.println("Add:- " +result);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int num1 = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int num2 = scan.nextInt();

        SumNumber sum = new SumImpl();
        sum.printSum(num1,num2);

        scan.close();
    }
}