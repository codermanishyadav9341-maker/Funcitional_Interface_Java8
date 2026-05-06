package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;
public class SquareCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<Integer,Integer> isSquare = num -> num*num;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Square is:- " +isSquare.apply(num));

        scan.close();

    }
}
