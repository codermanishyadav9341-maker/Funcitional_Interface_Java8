package ForEach_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Length {
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


        System.out.print("Characters Length is:- ");
        letters.stream()
                .map(String::length)
                .forEach(n->System.out.print(n+ " "));
    }
}
