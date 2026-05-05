package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Swap {
    void check(int a,int b);
}

class Result37{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Swap ss = (int a,int b) ->{
            System.out.println("Before Swap:- ");
            System.out.println("a:- " +a+ " b:- " +b);

           int temp = a;
            a = b;
            b = temp;

            System.out.println("After Swap:- ");
            System.out.println("a:- " +a+ " b:- " +b);

        };

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        ss.check(a,b);

        scan.close();
    }
}