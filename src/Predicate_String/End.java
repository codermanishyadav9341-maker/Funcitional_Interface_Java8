package Predicate_String;

import java.util.Scanner;
import java.util.function.Predicate;

@FunctionalInterface
public interface End {
    boolean isEnd(String str);
}

class Result7 implements End{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isEnd = str -> str != null && str.endsWith(".com");

    @Override
    public boolean isEnd(String str){
        return isEnd.test(str);
    }

    public void check(){
        System.out.print("Enter your Characters:- ");
        String str = scan.nextLine();


        System.out.println("Last letter(.com):- " +isEnd(str));
    }

    public static void main(String[] str){
        Result7 rr = new Result7();
        rr.check();

    }
}