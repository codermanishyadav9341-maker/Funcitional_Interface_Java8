package Predicate_String;


import java.util.Scanner;
import java.util.function.Predicate;
@FunctionalInterface
public interface LowerCase {
    boolean isLowerCase(String str);
}

class Result9 implements LowerCase{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isLowerCase = str ->str != null && str.equals(str.toLowerCase());

    @Override
    public boolean isLowerCase(String str){
        return isLowerCase.test(str);
    }

    public void check(){
        System.out.print("Enter your Alphabets:- ");
        String str = scan.nextLine();

        System.out.println("Check LowerCase:- " +isLowerCase.test(str));
    }

    public static void main(String[] args){
        Result9 rr = new Result9();
        rr.check();
    }
}