package FilterStream;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();


        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        System.out.print("Array elements:- ");
         numbers.stream()
                 .forEach(n->System.out.print(n+ " "));



         // stream perform

        List<Integer> duplicate =
                numbers.stream()
                        .distinct()
                        .collect(Collectors.toList());

        System.out.print("\nUnique number list:- " +duplicate);

    }
}
