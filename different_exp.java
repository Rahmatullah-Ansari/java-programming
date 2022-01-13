//three type of exception handling.
import java.util.*;
import java.io.*;
@SuppressWarnings("ALL")
public class different_exp {
    public static void main(String[] args){
        int array[]={0,1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number less than 4 :");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int result;
        FileInputStream file=null;
        try{
            result=array[num1]/array[num2];
            System.out.println("Result = "+result);
            file=new FileInputStream("E:/hello.txt");
        }
        catch(ArithmeticException e){
        System.out.println("exception="+e);
        }
        catch(ArrayIndexOutOfBoundsException a)
        {
            System.out.println("exception = "+a);
        }
        catch(FileNotFoundException t){
            System.out.println("exception = "+t);
        }
    }
    
}
