package Functional_Roof;

import java.util.Scanner;
import java.util.function.Function;

public class SquareNumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Side:- ");
        int side = scan.nextInt();

        Function<Integer,Integer> isSquare = (n) -> n*n;

        System.out.println("Square number is:- " +isSquare.apply(side));

        scan.close();
    }
}
