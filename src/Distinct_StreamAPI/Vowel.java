package Distinct_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Vowel {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> letters = new ArrayList<>();

        System.out.println("Enter your Characters:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        List<String> result =
                letters.stream()
                        .filter(str -> str.startsWith("A") || str.startsWith("E") || str.startsWith("I") ||
                                str.startsWith("O") || str.startsWith("U") || str.startsWith("a") || str.startsWith("e")
                        || str.startsWith("o") || str.startsWith("i") || str.startsWith("u"))
                        .distinct()
                        .sorted()
                        .toList();

        System.out.println("Words Start with CheckVowel letters:- " +result);


    }
}
