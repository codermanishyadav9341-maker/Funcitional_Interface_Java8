package Functional_Interface1;

import java.util.Scanner;
@FunctionalInterface
public interface Table {
    void table(int n);
}

class Result25 implements Table{

    @Override
    public void table(int n){
        for(int i = 1; i<=10; i++){
            System.out.println(n+ " * " +i+ " = " +(n*i));
        }
    }

    public static void main(String[] args){
        Table tt = new Result25();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your number:- ");
        int n = scan.nextInt();

        tt.table(n);
    }
}