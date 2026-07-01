package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface PositiveNumber {
    void printPositive(int num);
}

class PositiveImpl implements PositiveNumber{

    public void printPositive(int num){
        boolean result = num >= 0;
        System.out.println("Positive number is:- " +result);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        PositiveNumber positive = new PositiveImpl();
        positive.printPositive(num);

        scan.close();
    }
}
