package LambdaPracticeSet;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
@FunctionalInterface
public interface ListEvenNumber {
    boolean printEvenNumber(int number);
}
class Result11{
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

            ListEvenNumber evenNumber = (num) -> num%2 == 0;

            System.out.print("EvenNumber:- ");
            for(int num : list){
                if(evenNumber.printEvenNumber(num)){
                    System.out.print(num+ " ");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}