package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
@FunctionalInterface
public interface EvenNumber {
    void checkEven(int num);
}
class Result3{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            EvenNumber evenNumber = (num) -> {
                if(num%2 == 0){
                    System.out.println(num+ " is even number");
                }
                 else{
                     System.out.println(num+ " is odd number");
                }
            };

            System.out.print("Enter your number:- ");
            int num = scan.nextInt();

            evenNumber.checkEven(num);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input! please enter integer number");
        }
    }
}