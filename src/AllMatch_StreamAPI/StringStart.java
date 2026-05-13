package AllMatch_StreamAPI;

import AnyMatch_StreamAPI.StartLetter;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class StringStart {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<String> letters = new ArrayList<>();

        System.out.println("Enter Characters elements:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        boolean result =
                letters.stream()
                        .allMatch(str -> str.startsWith("M"));
        System.out.println(result);
        scan.close();
    }
}
