import java.util.*;
public class non
{
    public static void main(String...args)throws No_Alphabets_Match_Exception {
    Scanner sc=new Scanner(System.in);
    char c;
    System.out.println("Enter a character :");
    c=sc.next().charAt(0);
    if((c >= 'a' && c <= 'z')||(c >= 'A' && c <= 'Z')){
        System.out.println("character ="+c);
    }
    else
    throw new No_Alphabets_Match_Exception("Not allowed non alphabets"); 
    }
}
class No_Alphabets_Match_Exception extends Exception{
public No_Alphabets_Match_Exception(String  s){
    super(s);
}

}
