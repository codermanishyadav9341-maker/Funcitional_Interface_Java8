package findFirst_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
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

        Optional<String> result =
                letters.stream()
                        .filter(str -> str.length() > 5)
                        .findFirst();
        System.out.println("String Length > 5 is:- " +result.orElse(null));

        scan.close();

    }
}
