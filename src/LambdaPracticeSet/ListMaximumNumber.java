package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
@FunctionalInterface
public interface ListMaximumNumber {
    void printMaximum(List<Integer> num);
}
class Result15{
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
            for(int i =  0; i<size; i++){
                list.add(scan.nextInt());
            }

            // lambda used;
            ListMaximumNumber maximumNumber = (number) -> {
                 int max = number.get(0);
                 for(int num : number){
                     if(num >= max){
                         max = num;
                     }
                 }
                 System.out.println("Maximum elements:- " +max);
            };
            maximumNumber.printMaximum(list);
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}