package Distinct_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class RemoveDuplicateString {
       public static void main(String[] args){
           Scanner scan = new Scanner(System.in);

           System.out.print("Enter Size:- ");
           int size = scan.nextInt();
           scan.nextLine();

           List<String> letters = new ArrayList<>();

           System.out.println("Enter your Words:- ");
           for(int i = 0; i<size; i++){
               letters.add(scan.nextLine());
           }

           List<String> result =
                   letters.stream()
                           .distinct()
                           .collect(Collectors.toList());

           System.out.println("Unique words:- " +result);

           scan.close();
       }
}
