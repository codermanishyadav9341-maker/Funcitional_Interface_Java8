package LambdaPracticeSet;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
@FunctionalInterface
public interface ListSumElement {
    void printSum(List<Integer> num);
}
class Result14{
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

            ListSumElement sumElement = (number) -> {
                int sum = 0;

                for(int num: number){
                    sum += num;
                }
                System.out.println("Sum all elements:- " +sum);
            };

            sumElement.printSum(list);
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}