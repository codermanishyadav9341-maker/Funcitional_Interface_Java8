package Count_StreamAPI;


import java.util.HashSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
public class DuplicateCount {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();
        scan.nextLine();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }

        Set<Integer> result = new HashSet<>();
        long count =
                numbers.stream()
                        .filter(num -> !result.add(num))
                        .count();

        System.out.println("DuplicateCount is:- " +count);

    }
}
