package Map_StreamAPI;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
public class FirstLetter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> letters = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        System.out.println("Original Words list:- " +letters);

        List<String> result =
                letters.stream()
                        .map(str-> str.substring(0,1).toLowerCase())
                        .collect(Collectors.toList());

        System.out.println("Names first letter:- " +result);

    }
}
