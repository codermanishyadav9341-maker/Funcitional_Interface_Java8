package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Minimum {
    void findMin(int a,int b);
}

class Result18{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Minimum mp = (a,b) -> {
           int so = (a<b) ? a : b;
           System.out.println("Minimum number is:- " +so);
        };

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        mp.findMin(a,b);

        scan.close();
    }
}