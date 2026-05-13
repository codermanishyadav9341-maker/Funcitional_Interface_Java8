package AllMatch_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class StringLength {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> letters = new ArrayList<>();

        System.out.println("Enter Characters elements:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        boolean result =
                letters.stream()
                        .allMatch(str -> str.length() > 3);

        System.out.println("String length > 3 is:- " +result);

        scan.close();
    }
}
