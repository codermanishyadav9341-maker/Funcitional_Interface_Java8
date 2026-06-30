package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface Length {
    void printLength(String str);
}

class LengthImpl implements Length{
    @Override
    public void printLength(String str){
        if(str == null){
            System.out.println("Character cannot be define");
            return;
        }

        System.out.println("Character Length is:- " +str.length());
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        String str = scan.nextLine();

        LengthImpl lp = new LengthImpl();
        lp.printLength(str);

        scan.close();
    }
}
