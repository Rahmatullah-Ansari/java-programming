//not allow non-alphabet in name.
import java.util.*;
public class name {
    public static void main(String[] args)throws not_allowed{
        Scanner sc=new Scanner(System.in);
        String s;
        int flag=0,i=0;
        System.out.println("Enter your name = ");
        s=sc.nextLine();
        while(i<s.length()){
            if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='A' && s.charAt(i)<='Z') || s.charAt(i) == ' '){
            flag=0;
            }
            else
            flag=1;
            i++;
        }
        if(flag==1){
            throw new not_allowed("Non alphabet is not allowed.");
        }
        else
        System.out.print(s);

    }
}
class not_allowed extends Exception{
    public not_allowed(String mystr){
        super(mystr);
    }
}
