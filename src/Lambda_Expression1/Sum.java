package Lambda_Expression1;

import java.util.Scanner;
public interface Sum {
    void add(int a,int b);
}
class Result1 implements Sum{

    @Override
    public void add(int a,int b){
        System.out.println("Sum of two numbers is:- " +(a+b));
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Result1 rr = new Result1();

        System.out.print("Enter your first number:- ");
        int a = scanner.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scanner.nextInt();

        rr.add(a,b);

        scanner.close();
    }
}
