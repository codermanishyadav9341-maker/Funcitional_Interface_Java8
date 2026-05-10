package Distinct_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class RemoveEmail {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> emails = new ArrayList<>();

        System.out.println("Enter your Arrays elements:- ");
        for(int i = 0; i<size; i++){
            emails.add(scan.nextLine());
        }

        List<String> result =
                emails.stream()
                        .map(String::toLowerCase)
                        .distinct()
                        .toList();

        System.out.println("Unique email List:- " +result);

        scan.close();
    }
}
