package Stream_Rood;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class UpperCase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> letters = new ArrayList<>();


        System.out.println("Enter Characters:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        List<String> result =
                letters.stream()
                        .map(String::toUpperCase)
                        .toList();

        System.out.println("UpperCase:- " +result);

        scan.close();

    }
}
