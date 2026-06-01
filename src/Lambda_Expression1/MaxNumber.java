package Lambda_Expression1;

import java.util.Scanner;
@FunctionalInterface
public interface MaxNumber {
    void display(int a,int b);
}

class Result5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        MaxNumber mm = (a,b) -> {
            if(a>b){
                System.out.println(a+ " is Maximum number");
            }
             else if(b > a){
                 System.out.println(b+ " is Maximum number");
            }
              else{
                  System.out.println("Both are equal");
            }
        };

        System.out.print("Enter your first number:- ");
        int a = scan.nextInt();

        System.out.print("Enter your Second number:- ");
        int b = scan.nextInt();

        mm.display(a,b);

        scan.close();
    }
}