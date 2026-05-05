package Lambda_Expression;

import java.util.Scanner;

@FunctionalInterface
public interface SinglePara {
    void soImpl(int a);
}

class Result3{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        SinglePara sp = (int a) -> {
            System.out.println("Digits:- " +a);
        };

        System.out.print("Enter your number:- ");
        int a = scan.nextInt();

        sp.soImpl(a);

        scan.close();

    }
}