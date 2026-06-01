package Functional_Interface;

@FunctionalInterface
interface Hello {
    void sayHello();
}

class Test implements Hello{
    public void sayHello(){
        System.out.println("So functionalInterface");
    }
    public static void main(String[] args){
        Test ss = new Test();
        ss.sayHello();
    }
}

