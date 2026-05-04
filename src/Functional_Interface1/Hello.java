package Functional_Interface1;

@FunctionalInterface
interface  Hello {

    void sayHello();
}

class Result implements Hello{

    @Override
    public void sayHello(){
        System.out.println("WelCome to Functional Interface");
    }

    public static void main(String[] args){
        Hello rr = new Result();
        rr.sayHello();
    }
}

