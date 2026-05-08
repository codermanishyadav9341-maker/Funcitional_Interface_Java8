package Stream_Java8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Count {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scanner.nextInt();

        List<Integer> count = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            count.add(scanner.nextInt());
        }

        System.out.print("Array elements:- ");
        count.stream()
                .forEach(n->System.out.print(n+ " "));

        System.out.print("\nTotal Array Digits:- ");
      long total =  count.stream()
                .count();

      System.out.print(total);




    }
}
