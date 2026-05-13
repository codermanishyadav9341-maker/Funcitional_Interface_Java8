package findFirst_StreamAPI;

import java.util.*;

public class FirstDuplicateNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Size:- ");
        int size = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Enter your Array elements:- ");
        for(int i = 0; i<size; i++){
            numbers.add(scan.nextInt());
        }


        HashSet<Integer> seen = new HashSet<>();
        Optional<Integer> result =
                numbers.stream()
                        .filter(num -> !seen.add(num))
                        .findFirst();
        System.out.println("Duplicate first number is:- " +result.orElse(-1));

        scan.close();
    }
}
