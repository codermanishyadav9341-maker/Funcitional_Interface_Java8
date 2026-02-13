package Functional_Interface;

@FunctionalInterface
 interface Square {
    void square(int n);
}

class Result implements Square{
    public void square(int n){
        double square = (n*n);
        System.out.println("Square:- " +square);
    }

    public static void main(String[] args){
        Result rr = new Result();
        rr.square(20);
    }
}
