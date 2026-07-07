package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
public class CheckPassword {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<String> isPassword = (password) -> password != null && password.length() >= 8;

            System.out.print("Enter Password:- ");
            String str = scan.nextLine();

            System.out.println("Check password:- " +isPassword.test(str));
        }
    }
}
