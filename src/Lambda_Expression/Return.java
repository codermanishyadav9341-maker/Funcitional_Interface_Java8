package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Return {
    int soImpl(int num);
}

class Result5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        Return rr = (int num) -> {
            System.out.println("Value:- " +num);

            return num;
        };

        System.out.print("Enter your number:- ");
        int num = scan.nextInt();

        rr.soImpl(num);
    }
}