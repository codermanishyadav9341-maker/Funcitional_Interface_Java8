package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface EvenNumber {
    void checkEven(int num);
}

class EvenImpl implements EvenNumber{

    @Override
    public void checkEven(int num){
        boolean result = num%2 == 0;
        System.out.println("Even number is:- " +result);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        EvenImpl even = new EvenImpl();
        even.checkEven(num);
        scan.close();
    }
}