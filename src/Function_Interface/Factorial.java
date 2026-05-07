package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class Factorial {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<Integer,Integer> fact = num -> {
            int f = 1;
            for(int i = 1; i<=num; i++){
                f *= i;
            }

            return f;
        };

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Factorial:- " +fact.apply(num));

        scan.close();

    }
}
