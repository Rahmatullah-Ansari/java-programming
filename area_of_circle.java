//AREA OF CIRCLE USING CONSTRUCTOR.
import java.util.*;
public class area_of_circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of circle = ");
        int radius=sc.nextInt();
        new AREA(radius);
    }
    
}
class AREA{
    public AREA(int radius){
        final double pie=3.14159265359;
        System.out.println("Area of circle = "+(pie*radius*radius)+" square unit.");
    }
}
