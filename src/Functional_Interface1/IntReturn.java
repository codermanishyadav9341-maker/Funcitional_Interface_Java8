package Functional_Interface1;

@FunctionalInterface
public interface IntReturn {
    int number();
}

class Test16 implements IntReturn{

    @Override
    public int number(){
        return 10;
    }

    public static void main(String[] args){

        IntReturn rr = new Test16();

        System.out.println("Digit:- " +rr.number());

    }
}