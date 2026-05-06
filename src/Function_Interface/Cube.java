package Function_Interface;

import java.util.Scanner;
import java.util.function.Function;

public class Cube {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Function<Integer,Integer> cube = num -> num*num*num;

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        System.out.println("Volume of cube:- " +cube.apply(num));

        scan.close();

    }
}
