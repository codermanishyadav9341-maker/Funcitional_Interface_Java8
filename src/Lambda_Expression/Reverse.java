package Lambda_Expression;

import java.util.Scanner;
@FunctionalInterface
public interface Reverse {
    void check(String s);
}

class Result22{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);


        Reverse ss = (s) ->{

            String rev = "";

            for(int i = s.length()-1; i>=0; i--){
                rev = rev + s.charAt(i);
            }
            System.out.println("Reverse:- " +rev);
        };

        System.out.print("Enter Characters:- ");
        String s = scan.next();

        ss.check(s);

        scan.close();
    }
}