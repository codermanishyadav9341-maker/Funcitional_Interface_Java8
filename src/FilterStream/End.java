package FilterStream;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class End {
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


        System.out.print("Words:- ");
        letter.stream()
                .forEach(n->System.out.print(n+ " "));


        // stream processing

        List<String> end =
                letter.stream()
                        .filter(str-> str.endsWith("H"))
                        .collect(Collectors.toList());

        System.out.print("\nLetter ending with H:- " +end);

    }
}
