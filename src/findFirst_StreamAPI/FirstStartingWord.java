package findFirst_StreamAPI;


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
public class FirstStartingWord {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<String> letters = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            letters.add(scan.nextLine());
        }

        Optional<String> result =
                letters.stream()
                        .filter(str -> str.startsWith("M"))
                        .findFirst();

        System.out.println("First Letter Start With M is:- " +result.orElse(null));

    }
}
