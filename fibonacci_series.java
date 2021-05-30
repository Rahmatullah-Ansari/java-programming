//fibonacci series.
import java.util.*;
public class fibonacci_series
{
    public static void main(String...fibo) {
        FIBO f=new FIBO();
        f.series_generate();
    }
}
class FIBO{
int n;
FIBO(){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number = ");
n=sc.nextInt();
System.out.println(n);
}
public void series_generate(){
    int i=0,j=1,l;
    System.out.println("Fibonacci series : ");
    for(int k=1;k<=n;k++)
    {
        System.out.print(i+" ");
        l=i+j;
        i=j;
        j=l;
    }
}
}
