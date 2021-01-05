package day09;

public class ValueTransfer {
    public static void main(String[] args) {
        String s1= "Hello";
        ValueTransfer test = new ValueTransfer();
        test.change(s1);

        //s1 is still Hello, String is final
        //if it's a basic value type, it passes the actual value
        //if it's an object, it passes the address
        System.out.println(s1);
    }

    public void change(String s){
        s = "hi~~";
    }
}
