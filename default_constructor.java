//user input 1-3 and perform different task with constructor.
import java.util.*;
public class default_constructor{
    public default_constructor(){
    }
    void show(){
        System.out.println("hi this is default constructor");
    }
    String s = " ";
    default_constructor(String message){
        s=message;
    }
    void out(){
        System.out.println(s);
    }
    int x=0;
    default_constructor(int a,int b){
        x=a*b;
    }
    void dis(){
        System.out.println(x);
    }
public static void main(String...Rahmatullah){
        System.out.println("Enter the number between(1-3):");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch(num){
            case 1:
            new default_constructor();
            break;
            case 2:
            new default_constructor(3,8);
            break;
            case 3:
            new default_constructor("Hello.");
            default_constructor c=new default_constructor();
            c.show();
            default_constructor e =new default_constructor(3,8);
            e.dis();
            default_constructor f=new default_constructor("Hello.");
            f.out();
        }
    }
}
