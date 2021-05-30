//NO MATCH EXCEPTION
import java.util.*;
public class notequal {
    public static void main(String[] args)throws No_Match_Exception{
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.print("Enter a string:");
        str=sc.nextLine();
        if(str != "INDIA"){
            throw new No_Match_Exception("Not equal");
        }
        else
        System.out.print(str);
    }
    
}
class No_Match_Exception extends Exception{
    public No_Match_Exception(String s){
        super(s);
    }
}
