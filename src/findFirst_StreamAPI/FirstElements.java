package findFirst_StreamAPI;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
public class FirstElements {
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

        Optional<Integer> result =
                numbers.stream()
                        .findFirst();

       if(result.isPresent()){
           System.out.println("Array first elements:- " +result);
       }
        else{
            System.out.println("List is empty");
       }

        scan.close();

    }
}
