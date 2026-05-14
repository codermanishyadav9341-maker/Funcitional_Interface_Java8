package NoneMatch_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class EmptyString {
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

        boolean result =
                letters.stream()
                        .noneMatch(str -> str.isEmpty());

        System.out.println("No Empty String is:- " +result);
        scan.close();
    }
}
