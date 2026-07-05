package LambdaPracticeSet;

import java.util.Scanner;
@FunctionalInterface
public interface Uppercase {
    void printUppercase(String str);
}
class Result7{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Uppercase uppercase = (str) ->{

                System.out.println("Uppercase:- " +str.toUpperCase());
            };

            System.out.print("Enter Characters:- ");
            String str = scan.nextLine();

            uppercase.printUppercase(str);
        }
        catch (Exception e){
            System.out.println("Sometime went wrong");
        }
    }
}