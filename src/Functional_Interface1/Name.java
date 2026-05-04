package Functional_Interface1;

import java.util.Scanner;

@FunctionalInterface
public interface Name {
    void showName(String name);
}

class Test22 implements Name{

    @Override
    public void showName(String name){
        System.out.println("Name:- " +name);
    }

    public static void main(String[] args){
        Name nt = new Test22();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Name:- ");
        String name = scan.nextLine();
        nt.showName(name);

        scan.close();
    }
}