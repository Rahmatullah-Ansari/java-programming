import java.util.*;
public class occurence_of_character {
    public static void main(String[] args) {
        System.out.println("Enter a string = ");
        Scanner sc =new Scanner(System.in);
        String str = sc.nextLine();
        int c=1;
        char []arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            c=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    ++c;
                }
            }
            if(c==1)
            continue;
            else{
                if(arr[i]==' ')
                System.out.println("occurence of space is = "+c);
                else
                System.out.println("occurence of "+arr[i]+" is = "+c);
            }
            c=0;
        }
    }
}
