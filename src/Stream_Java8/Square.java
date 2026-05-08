package Stream_Java8;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Square {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            list.add(scanner.nextInt());
        }

        System.out.print("Array Elements:- ");
        list.stream()
                .forEach(n->System.out.print(n+ " "))  ;


        System.out.print("\nSquare of each elements:- ");
        list.stream()
                .map(num -> num*num)
                .forEach(n->System.out.print(n+ " "));


        scanner.close();
    }
}
