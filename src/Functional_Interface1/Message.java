package Functional_Interface1;

@FunctionalInterface
public interface Message {

    abstract void send();
}

class Test4 implements Message{

    @Override
    public void send(){
        System.out.println("Message Send");
    }

    public static void main(String[] args){
        Message mm = new Test4();
        mm.send();
    }
}