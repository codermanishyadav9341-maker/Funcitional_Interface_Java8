package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
@FunctionalInterface
public interface RemoveOddNumber {
    void printRemoveOdd(List<Integer> num);
}
class Result21{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Size:- ");
            int size = scan.nextInt();

            if(size <= 0){
                System.out.println("Size must be positive");
                return;
            }

            List<Integer> list = new ArrayList<>();

            System.out.println("Enter Array elements:- ");
            for(int i = 0; i<size; i++){
                list.add(scan.nextInt());
            }
            // remove odd number;
            RemoveOddNumber oddNumber = (number) -> {
                number.removeIf((num) -> num%2 != 0);
                System.out.println("Remove Odd number:- " +number);
            };

            oddNumber.printRemoveOdd(list);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}