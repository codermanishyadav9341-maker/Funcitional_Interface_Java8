package Optional.Of;

import java.util.Scanner;
import java.util.Optional;
public class City {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter City:- ");
        String name = scan.nextLine();

        Optional<String> city = Optional.of(name);

        if(city.isPresent()){
            System.out.println("City:- " +city.get());
        }
         else{
             System.out.println("No city present");
        }

         scan.close();
    }
}
