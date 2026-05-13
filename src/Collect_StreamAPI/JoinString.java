package Collect_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class JoinString {
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

        String result =
                letters.stream()
                        .collect(Collectors.joining());
        System.out.println("Joining letters is:- " +result);

        scan.close();

    }
}
