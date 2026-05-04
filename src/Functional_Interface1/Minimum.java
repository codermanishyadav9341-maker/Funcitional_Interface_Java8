package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Minimum {
    int min(int a,int b);
}

class Result33 implements Minimum{

    public int min(int a,int b){
        return (a < b) ? a: b;
    }

    public static void main(String[] args){
        Minimum mi = new Result33();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        System.out.println("Minimum number is:- " +mi.min(a,b));

    }
}
