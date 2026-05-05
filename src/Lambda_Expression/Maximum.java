package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Maximum {
    void findMax(int a,int b);
}

class Result17{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Maximum mm = (a,b) -> {
         int so =   (a>b) ? a : b;
            System.out.println("Maximum number is:- " +so);
        };

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        mm.findMax(a,b);
    }
}