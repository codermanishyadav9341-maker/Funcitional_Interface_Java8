package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
@FunctionalInterface
public interface ListOddNumber {
    boolean printOddNumber(int num);
}
class Result12{
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Enter Size:- ");
            int size = scan.nextInt();

            if(size < 0){
                System.out.println("Size can be positive");
                return;
            }

            List<Integer> list = new ArrayList<>();
            System.out.println("Enter Array elements:- ");
            for(int i = 0; i<size; i++){
                list.add(scan.nextInt());
            }

            ListOddNumber oddNumber = (number) -> number%2 != 0;

            System.out.print("Odd number:- ");
            for(int num: list){
                if(oddNumber.printOddNumber(num)){
                    System.out.print(num+ " ");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}