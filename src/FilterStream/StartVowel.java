package FilterStream;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StartVowel {
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


         // stream perform

        List<String> vowel =
                letter.stream()
                        .filter(str-> str.startsWith("E"))
                        .collect(Collectors.toList());

        System.out.print("\nStart Vowel:- "  +vowel);

    }
}
