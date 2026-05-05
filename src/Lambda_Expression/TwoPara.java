package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface TwoPara {
    void soImpl(int a, int b);
}

class Result4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        TwoPara tp = (int a,int b) -> {
            System.out.println("a:- " +a+ "\nb:- " +b);
        };

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        tp.soImpl(a,b);
    }
}