package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface StringLen {
    void lenImpl(String s);
}

class Result19{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        StringLen sl = (s)  ->
                System.out.println("String Length is:- " +s.length());

        System.out.print("Enter your Character:- ");
        String s = scan.next();

        sl.lenImpl(s);

        scan.close();

    }
}