package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class CheckPrime {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isPrime = (num) -> {
                if(num <= 1){
                    return false;
                }
                for(int i = 2; i<=Math.sqrt(num); i++){
                    if(num%i == 0){
                        return false;
                    }
                }
                return true;
            };

            System.out.print("Enter number:- ");
            int num = scan.nextInt();

            System.out.println("Chek prime number:- " +isPrime.test(num));
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
