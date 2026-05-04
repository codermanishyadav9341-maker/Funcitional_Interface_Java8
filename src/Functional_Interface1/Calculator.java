package Functional_Interface1;

@FunctionalInterface
public interface Calculator {
    void calculate();
}

class CalcImpl implements Calculator{

    @Override
    public void calculate(){
        System.out.println("Calculating........");
    }

    public static void main(String[] args){
        Calculator cc = new CalcImpl();
        cc.calculate();

    }
}