package Predicate1;

import java.util.Scanner;
import java.util.function.Predicate;
public class EvenNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        Predicate<Integer> isEven = n -> n%2 == 0;

        System.out.println("Even number is:- " +isEven.test(num));

    }
}
