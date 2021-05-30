// import java.util.*;
public class fact {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        System.out.println("Enter a num:");
        // int num = sc.nextInt();
        int num = Integer.parseInt(System.console().readLine());
        float f=1.0f;
        for(int i=1;i<=num;i++){
            f *= i;
        }
        System.out.println("Factorial="+f);
    }
}
