package Lambda_Expression;

import Lambda_Expression.Hello;

class Result1{

    public static void main(String[] args){

        Hello h = () ->{
            System.out.println("Hello");
        };

        h.helloImpl();
    }
}

