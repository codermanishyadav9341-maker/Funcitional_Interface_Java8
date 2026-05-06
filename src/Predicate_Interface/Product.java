package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class Product {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isProduct = num -> (num%2 == 0  && num%3 == 0);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Multiple by 2 and 3 is:- " +isProduct.test(num));

    }
}
