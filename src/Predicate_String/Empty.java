package Predicate_String;
import java.util.Scanner;
import java.util.function.Predicate;
@FunctionalInterface
public interface Empty {
    boolean isEmpty(String str);
}

class Result1 implements Empty{
    Scanner scan = new Scanner(System.in);

    Predicate<String> isEmpty = str -> str == null || str.trim().isEmpty();

    public boolean isEmpty(String str){
        return isEmpty.test(str);
    }

    public  void check(){
        System.out.print("Enter your Characters:- ");
        String str = scan.nextLine();

        System.out.println("String empty is:- " +isEmpty(str));
    }

    public static void main(String[] args){
        Result1 rr = new Result1();
        rr.check();

    }

}