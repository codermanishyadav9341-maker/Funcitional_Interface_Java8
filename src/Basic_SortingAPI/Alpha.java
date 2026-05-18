package Basic_SortingAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Alpha {
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

        List<String> result =
                letters.stream()
                        .sorted()
                        .toList();

        System.out.println("Is Sorted String is:- " +result);

        scan.close();
    }
}
