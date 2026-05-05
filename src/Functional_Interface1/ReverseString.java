package Functional_Interface1;

@FunctionalInterface
public interface ReverseString {
    String reverse(String s);
}

class Result61 implements ReverseString{

    @Override
    public String reverse(String s){
        String rev = "";
        for(int i = s.length()-1; i>=0; i--){
            rev += s.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args){
        ReverseString rr = new Result61();


        System.out.println(rr.reverse("Manish"));

    }
}
