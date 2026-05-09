package Map_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class UpperCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String>  letters = new ArrayList<>();

        System.out.println("Enter your name:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        // Input Display
        System.out.println("Original List Names:- " +letters);

        // Stream processing
        List<String> names =
                letters.stream()
                        .map(str -> str.toUpperCase())
                        .collect(Collectors.toList());

        System.out.println("Names List:- " +names);

    }
}
