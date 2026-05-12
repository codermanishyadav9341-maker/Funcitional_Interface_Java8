package Count_StreamAPI;

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

        System.out.println("Enter Names:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        long result =
                letters.stream()
                        .filter(str -> str.length() > 4)
                        .count();
        System.out.println("String Length GreaterThan > 4 is:- " +result);

        scan.close();
    }
}
