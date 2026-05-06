package Predicate_Interface;

import java.util.Scanner;
import java.util.function.Predicate;

public class Start {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Predicate<String> isStart = str -> str != null && str.startsWith("M");

        System.out.print("Enter your Letter:- ");
        String str = scan.nextLine();


        System.out.println("Is Letter Start With M is:- " +isStart.test(str));

    }
}
