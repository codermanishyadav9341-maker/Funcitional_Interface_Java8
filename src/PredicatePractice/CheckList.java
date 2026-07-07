package PredicatePractice;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
public class CheckList {
    public static void main(String[] args){
        try(Scanner scan = new Scanner(System.in)){

            Predicate<Integer> isList = (list) -> list > 50;

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

            System.out.println("List greater >= 50:- " +isList.test(size));
        }
    }
}
