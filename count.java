//count word,number etc.
import java.util.*;
import javax.lang.model.util.ElementScanner14;
public class count {
    public static void main(String[] args) {
        COUNT_C("hello hii 3333 444 55 +++{|}OY&_^$$**)^(IKFJ");
    }
    public static void COUNT_C(String s){
        int alpha=0,number=0,special=0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == ' ')
            continue;
            else if((s.charAt(i)>='A' && s.charAt(i)<='Z')||(s.charAt(i)>='a' && s.charAt(i)<='z'))
            alpha++;
            else if(s.charAt(i)>='0' && s.charAt(i)<='9')
            number++;
            else
            special++;
        }
        StringTokenizer st=new StringTokenizer(s);
        System.out.println("Number of alphabet = "+alpha);
        System.out.println("Number of numeric value = "+number);
        System.out.println("Number of special character = "+special);
        System.out.println("Number of words = "+st.countTokens());
    }
    }