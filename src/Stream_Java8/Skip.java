package Stream_Java8;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Skip {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scanner.nextInt();

        List<Integer> number = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            number.add(scanner.nextInt());
        }

        System.out.print("Array elements:- ");
        number.stream()
                .forEach(n->System.out.print(n+ " "));



        System.out.print("\nSkip elements:- ");
            number.stream()
                    .skip(number.indexOf(2))
                    .forEach(System.out::print);
    }
}
