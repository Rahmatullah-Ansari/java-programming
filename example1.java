import java.util.Scanner;
public class example1{
    public static void main(String[] args) {
        System.out.println("Enter a number =");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>56){
            System.out.println("Ram");
        }else if(a>46){
            System.out.println("Krishn");
        }else if(a>36){
            System.out.println("Shiyam");
        }else{
            System.out.println("Not");
        }
    }
}