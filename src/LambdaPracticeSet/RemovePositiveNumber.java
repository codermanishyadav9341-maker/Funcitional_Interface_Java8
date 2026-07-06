package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
@FunctionalInterface
public interface RemovePositiveNumber {
    void printRemovePositive(List<Integer> num);
}
class Result22{
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

            //Remove positive number;
            RemovePositiveNumber positiveNumber = (number) -> {
                number.removeIf((num) -> num > 0);
                System.out.println("Remove positive number:- " +number);
            };

            positiveNumber.printRemovePositive(list);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}