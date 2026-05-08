package Stream_Java8;

import java.util.Optional;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class FirstElements {
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

        System.out.print("\nArray first elements:- ");

        Optional<Integer> first =
                number.stream()
                        .findFirst();
                System.out.print(first.get());
    }
}
