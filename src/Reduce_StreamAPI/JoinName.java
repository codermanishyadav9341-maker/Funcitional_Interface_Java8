package Reduce_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
public class JoinName {
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
                        .reduce((a,b) ->a+ " ," +b);

        System.out.println("JoinName:- " +result.orElse(" "));

    }
}
