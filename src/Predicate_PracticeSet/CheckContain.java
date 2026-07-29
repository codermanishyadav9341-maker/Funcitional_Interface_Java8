package Predicate_PracticeSet;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckContain {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isContain = (str) -> str.contains("Spring");

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            System.out.println("Check Contain:- " +isContain.test(str));
        }
    }
}
