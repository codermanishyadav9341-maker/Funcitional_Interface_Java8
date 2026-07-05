package LambdaPracticeSet;

import java.util.Scanner;
@FunctionalInterface
public interface ReverseString {
    void printReverse(String str);
}
class Result8{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            ReverseString reverse = (str) -> {
                System.out.println("Reverse:- " + new StringBuilder(str).reverse());
            };

            System.out.print("Enter Character:- ");
            String str = scan.nextLine();

            reverse.printReverse(str);
        }
        catch (Exception e){
            System.out.println("Sometime wrong");
        }
    }
}