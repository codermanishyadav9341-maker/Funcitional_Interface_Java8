package Predicate_String;


import java.util.Scanner;
import java.util.function.Predicate;
@FunctionalInterface
public interface Length {
    boolean length(String str);
}

class Result2 implements Length{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isLength = str -> str.length()>5;

    @Override
    public boolean length(String str){
        return isLength.test(str);
    }

    public void check(){
        System.out.print("Enter your Words:- ");
        String str = scan.nextLine();


        System.out.println("Words Length is:- " +length(str));
    }

    public static void main(String[] args){
        Result2 rr = new Result2();
        rr.check();


    }
}
