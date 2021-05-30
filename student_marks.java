//sum of marks of five student.
import java.util.*;
class student_marks{
public static void main(String...str)throws myexception{
    int num,sum=0;
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<=5;i++){
        System.out.print("Enter marks of student - "+i+":");
        num=sc.nextInt();
        System.out.println(num);
        if(num>500)
        throw new myexception("Invalid marks.");
        else
sum+=num;
    }
    System.out.println("Total marks = "+sum);
}
}
class myexception extends Exception{
public myexception(String s){
    System.out.println("Exception is ="+s);
}
}