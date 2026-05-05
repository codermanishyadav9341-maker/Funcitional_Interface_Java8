package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Addition {
    void addImpl(int a, int b);
}

class Result7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Addition ad = (int a, int b) ->{
            System.out.println("Additions:- " +(a+b));
        };

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        ad.addImpl(a,b);
    }
}