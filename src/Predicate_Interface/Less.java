package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class Less {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isLess = num -> num<50;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Is LessThan 50:- " +isLess.test(num));

        scan.close();

    }
}
