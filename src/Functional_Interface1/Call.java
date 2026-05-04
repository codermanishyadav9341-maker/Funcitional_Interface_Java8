package Functional_Interface1;

@FunctionalInterface
public interface Call {
    void call();
}

class Test8 implements Call{

    @Override
    public void call(){
        System.out.println("Calling methods......");
    }

    public static void main(String[] args){
        Call cc = new Test8();
        cc.call();
    }
}