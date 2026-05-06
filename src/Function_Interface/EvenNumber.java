package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class EvenNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<Integer,String> even = num -> num%2 == 0 ? "Even" : "Odd";

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Even Letter:- " +even.apply(num)) ;

        scan.close();

    }
}
