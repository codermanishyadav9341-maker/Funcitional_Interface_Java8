package Functional_Interface1;

@FunctionalInterface
public interface PrintHello {

    void printHello();
}

class Test implements PrintHello{

    @Override
    public void printHello(){
        System.out.println("Hello Java8");
    }

    public static void main(String[] args){
        PrintHello tt = new Test();
        tt.printHello();
    }
}