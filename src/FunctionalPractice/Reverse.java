package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface Reverse {
    void printReverse(String str);
}

class ReverseImpl implements Reverse{

    @Override
    public void printReverse(String str){
       if(str == null || str.isEmpty()){
           System.out.println("String cannot be empty or null");
           return;
       }

        String result = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse Characters:- " +result);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Character:- ");
        String str = scan.nextLine();

        Reverse reverse = new ReverseImpl();
        reverse.printReverse(str);

        scan.close();
    }
}
