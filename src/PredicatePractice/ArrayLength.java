package PredicatePractice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;
public class ArrayLength {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isSize = (size ) -> size > 5;

            System.out.print("Enter Size:- ");
            int size = scan.nextInt();

            if(size <= 0){
                System.out.println("Size must be positive");
                return;
            }

            int[] arr = new int[size];

            System.out.println("Enter Array elements:- ");
            for(int i = 0; i<size; i++){
                arr[i] = scan.nextInt();
            }

            System.out.println("Check length > 5:- " +isSize.test(size));
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}
