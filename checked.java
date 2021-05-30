//user defined checked,inbuilt checked and unchecked exception.
import java.io.*;
import java.util.*;
public class checked{
    public static void main(String[] args)throws user_exception{
        FileInputStream file=null;
        int result,num;
        System.out.println("Enter a number = ");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();
        try{

            result=10/0;//inbuild unchecked exception.
        }
        catch(ArithmeticException ar){
            System.out.println("exception = "+ar);
        }
        try{
            file=new FileInputStream("D:/hello.txt");//inbuilt checked exception.
        }
        catch(FileNotFoundException f){
            System.out.println("exception = "+f);
        }
        if(num<0){
                throw new user_exception("Negative number.");//user defined checked exception.
    }
    else
    System.out.println(num);
}
}
class user_exception extends Exception{
    public user_exception(String str){
        super(str);
    }
}