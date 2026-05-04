package Functional_Interface1;

@FunctionalInterface
public interface Printer {
    void print();
}

class Test7 implements Printer{

    @Override
    public void print(){
        System.out.println("Printing..........");
    }

    public static void main(String[] args){
        Printer pp = new Test7();
        pp.print();

    }
}