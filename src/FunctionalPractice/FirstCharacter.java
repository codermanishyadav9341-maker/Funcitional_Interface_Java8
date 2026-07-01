package FunctionalPractice;

import java.util.Scanner;
@FunctionalInterface
public interface FirstCharacter {
    void checkFirstCharacter(String str);
}

class FirstImpl implements FirstCharacter{

    @Override
    public void checkFirstCharacter(String str){
        if(str == null){
            System.out.println("String cannot be empty or null");
            return;
        }

        char firstCha = str.charAt(0);
        System.out.println("First Character:- " +firstCha);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Characters:- ");
        String str = scan.nextLine();

        FirstCharacter first = new FirstImpl();
        first.checkFirstCharacter(str);

        scan.close();
    }
}