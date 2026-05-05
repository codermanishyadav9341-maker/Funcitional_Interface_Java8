package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;
public class GreaterSalary {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<Integer> isSalary = salary -> salary != null && salary >= 50000;

        System.out.print("Enter your Salary:- ");
        int salary = scan.nextInt();

        System.out.println("GreaterThan Salary > 50000:- " +isSalary.test(salary));

    }
}
