package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Substraction {
    void subImpl(int a, int b);
}

class Result8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Substraction ss = ( a,b) ->{
            System.out.println("Substraction:- " +(a-b));
        };

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        ss.subImpl(a,b);
    }
}