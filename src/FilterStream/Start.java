package FilterStream;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Start {
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

        System.out.print("Word:- ");
        letter.stream()
                .forEach(n->System.out.print(n+ " "));


        // stream processing

        List<String> first =
                letter.stream()
                        .filter(str-> str.startsWith("M"))
                        .collect(Collectors.toList());

        System.out.print("\nStarting with M:- " +first);


        scan.close();
    }
}
