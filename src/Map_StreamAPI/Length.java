package Map_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
public class Length {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> letters = new ArrayList<>();

        System.out.println("Enter Employee Names:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        System.out.println("Employee Names list:- " +letters);

        //stream processing
        List<Integer> length =
                letters.stream()
                        .map(str -> str.length())
                        .collect(Collectors.toList());

        System.out.println("String Length:- " +length);

    }
}
