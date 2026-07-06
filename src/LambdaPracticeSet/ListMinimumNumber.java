package LambdaPracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
@FunctionalInterface
public interface ListMinimumNumber {
    void printMinimum(List<Integer> num);
}
class Result16{
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Size:- ");
            int size = scan.nextInt();

            if(size <= 0){
                System.out.println("Size can be positive");
                return;
            }

            List<Integer> list = new ArrayList<>();
            System.out.println("Enter Array elements:- ");
            for(int i = 0 ; i<size; i++){
                list.add(scan.nextInt());
            }

            //Lambda
            ListMinimumNumber minimumNumber = (number) -> {
                int min = number.get(0);

                for(int num : number){
                    if(num < min){
                        min = num;
                    }
                }
                System.out.println("Minimum array elements:- " +min);
            };
            minimumNumber.printMinimum(list);

        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
    }
}