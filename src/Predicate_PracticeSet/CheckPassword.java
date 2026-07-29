package Predicate_PracticeSet;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckPassword {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isPass = (str) -> str.matches("[6-9]\\d{9}");

            System.out.print("Enter Password:- ");
            String str = scan.nextLine();

            System.out.println("Check Password:- " +isPass.test(str));
        }
    }
}