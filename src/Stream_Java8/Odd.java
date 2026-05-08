package Stream_Java8;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Odd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scanner.nextInt();

        List<Integer> number = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            number.add(scanner.nextInt());
        }

        System.out.print("Array Elements:- ");
        number.stream()
                .forEach(n->System.out.print(n+ " "));


        System.out.print("\nOdd number:- ");
        number.stream()
                .filter(num -> num%2 != 0)
                .forEach(n->System.out.print(n+ " "));


        scanner.close();

    }
}
