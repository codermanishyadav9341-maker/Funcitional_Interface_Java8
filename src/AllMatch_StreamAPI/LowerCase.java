package AllMatch_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class LowerCase {
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
                        .allMatch(str -> str.equals(str.toLowerCase()));

        System.out.println(result);
        scan.close();
    }
}
