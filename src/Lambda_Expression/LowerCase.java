package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface LowerCase {
    void check(String s);
}

class result21{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        LowerCase lp = (s) ->
                System.out.println("LowerCase:- " +s.toLowerCase());

        System.out.print("Enter your Letter:- ");
        String s = scan.next();

        lp.check(s);

        scan.close();

    }
}