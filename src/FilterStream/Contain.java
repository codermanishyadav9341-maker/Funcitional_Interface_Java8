package FilterStream;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Contain {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> letter = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            letter.add(scan.nextLine());
        }

        System.out.print("Array elements:- ");
        letter.stream()
                .forEach(n->System.out.print(n+ " "));


//        Stream perform

        List<String> contain =
                letter.stream()
                        .filter(str -> str.contains("Phyton"))
                        .collect(Collectors.toList());


        System.out.println("\nContains:- " +contain);

    }
}
