import java.util.*;
public class oc
{
    public static void main(String...args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String :");
        String str=sc.nextLine();
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            flag=true;
            for(int j=0;j<str.length();j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("The first non repeating character is ="+str.charAt(i));
                break;
            }
        }
    }
}
