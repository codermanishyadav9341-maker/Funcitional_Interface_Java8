package Map_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Convert {
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

        System.out.println("Original List:- " +letters);

        List<String> firstLetter =
                letters.stream()
                        .map(str-> str.substring(0,1).toUpperCase()+str.substring(1))
                        .collect(Collectors.toList());

        System.out.println("Capital first letters:- " +firstLetter);


    }

}
