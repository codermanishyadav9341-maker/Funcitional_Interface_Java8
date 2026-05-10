package Limit_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class StartLetter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = Integer.parseInt(scan.nextLine());

        List<String> letters = new ArrayList<>();

        System.out.println("Enter Characters:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        List<String> result =
                letters.stream()
                        .filter(str -> str.startsWith("M"))
                        .limit(2)
                        .toList();
        System.out.println("Start With letter M:- " +result);

        scan.close();
    }
}
