package Predicate_PracticeSet;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckStart {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            final Predicate<String> isStart = (str) -> str != null && str.toUpperCase().startsWith("M");

            System.out.print("Enter character:- ");
            String str = scan.nextLine();

            System.out.println("Check String start with 'M':- " +isStart.test(str));
        }
    }
}
