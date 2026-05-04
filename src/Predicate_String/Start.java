package Predicate_String;

import java.util.Scanner;
import java.util.function.Predicate;
@FunctionalInterface
public interface Start {
    boolean isStart(String str);
}

class Result6 implements Start{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isStart = str -> str.startsWith("A");

    public boolean isStart(String str){
        return isStart.test(str);
    }

    public void check(){
        System.out.print("Enter your Letter:- ");
        String str = scan.nextLine();

        System.out.println("Starting Letter,s A:- " +isStart(str));
    }

    public static void main(String[] args){
        Result6 rr = new Result6();
        rr.check();


    }
}