package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class Value {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<Integer,String> value = num -> String.valueOf(num);

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();


        System.out.println("Digits into Letter:- " +value.apply(num));

    }
}
