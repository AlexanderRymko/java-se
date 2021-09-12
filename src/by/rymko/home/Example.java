package by.rymko.home;

public class Example {
    public static void main(String[] args) {
        System.out.println("Hello!World");
        // TODO Input a and b using console input
        int a=2;
        int b=1;
        int c=6;
        int d=3;
        int e=a*(b+(c/d));
        System.out.println(e);
        // TODO Extract below logic of determination condition in separate method
        if(10<(a+b) & (a+b)<=20) {
            boolean b1=true;
            System.out.println(b1);
        }
        else {
            boolean b2=false;
            System.out.println(false);
        }
    }
}
