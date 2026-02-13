package Functional_Interface;

@FunctionalInterface
interface Number {
    void sum(int n);
}

class Num implements Number{
    public void sum(int n){
        System.out.println("Number is " +n);
    }

    public static void main(String[] args){
        Num nn = new Num();
        nn.sum(10);
    }
}
