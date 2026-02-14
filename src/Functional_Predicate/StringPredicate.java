package Functional_Predicate;

import java.util.Scanner;

@FunctionalInterface
 interface StringPredicate {
    boolean check(String s);

}

class Test2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringPredicate isLength = s -> s.length()>10;

        System.out.print("Enter your Words:- ");
        String s = scan.next();

        System.out.println("Words Length:- " +isLength.check(s));

    }
}
