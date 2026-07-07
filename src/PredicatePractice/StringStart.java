package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class StringStart {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isStart = (str) ->  str != null && str.toUpperCase().startsWith("M");

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            System.out.println("Character startWith 'M':- " +isStart.test(str));
        }
    }
}
