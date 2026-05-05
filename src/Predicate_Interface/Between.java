package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class Between {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isBetween = num -> (num >10 && num <100);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Is Between 10 && 100:- " +isBetween.test(num));

        scan.close();


    }
}
