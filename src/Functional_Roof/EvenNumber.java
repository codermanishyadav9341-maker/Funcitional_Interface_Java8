package Functional_Roof;

import java.util.Scanner;
import java.util.function.Predicate;
public class EvenNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number:- ");
        int num = scan.nextInt();

        Predicate<Integer> isEven = n-> n%2 == 0;

        if(isEven.test(num)){
            System.out.println(num+ " is even number");
        }
         else{
             System.out.println(num+ " is Odd number");
        }

         scan.close();
    }
}
