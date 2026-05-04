package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Sub {
    void sub(int a,int b);
}

class Result22 implements Sub{

    @Override
    public void sub(int a,int b){
        System.out.println("Substractions of a and b is:- " +(a-b)) ;
    }

    public static void main(String[] args){
        Sub ss = new Result22();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        ss.sub(a,b);

        scan.close();

    }
}