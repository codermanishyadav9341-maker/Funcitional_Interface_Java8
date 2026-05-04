package Functional_Interface1;

@FunctionalInterface
public interface OnePara {

    void show(int a);
}

class Test18 implements OnePara{

    @Override
    public void show(int a){
        System.out.println("Digit:- " +a);
    }

    public static void main(String[] args){
        OnePara op = new Test18();
        op.show(10);
    }
}