package Stream_Java8;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Product {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scanner.nextInt();

        List<Integer> number = new ArrayList<>();

        System.out.println("Enter Array elements:- ");
        for(int i = 0; i<size; i++){
            number.add(scanner.nextInt());
        }

        //Stream apply
        System.out.print("Array elements:- ");
        number.stream()
                .forEach(n->System.out.print(n+ " "));


        System.out.print("\nNew ArrayList multiply by 10:- ");
             List<Integer> result = number.stream()
                     .map(num ->num*10)
                     .collect(Collectors.toList());
             System.out.print(result);


    }
}
