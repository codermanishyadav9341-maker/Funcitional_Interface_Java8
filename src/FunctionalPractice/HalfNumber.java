package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface HalfNumber {
    void printHalfNumber(double num);
}

class HalfImpl implements HalfNumber{

    @Override
    public void printHalfNumber(double num){
        double result = num / 2;
        System.out.println("Half number is:- " +result);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        double num = scan.nextDouble();

        HalfNumber half = new HalfImpl();
        half.printHalfNumber(num);

        scan.close();
    }
}