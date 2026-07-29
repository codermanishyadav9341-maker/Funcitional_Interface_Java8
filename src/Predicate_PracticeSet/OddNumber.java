package Predicate_PracticeSet;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
public class OddNumber {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            System.out.print("Enter Size:- ");
            int size = scan.nextInt();

            if(size < 0){
                throw new IllegalArgumentException("Size must be positive");
            }

            List<Integer> list = new ArrayList<>();

            System.out.println("Enter list elements:- ");
            for(int i = 0; i<size; i++){
                list.add(scan.nextInt());
            }

            Predicate<Integer> isOdd = (num) -> num%2 != 0;

            System.out.print("Odd number:- ");
            for(Integer num : list){
                if(isOdd.test(num)){
                    System.out.print(num +" ");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Invalid! Please enter Integer number");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
