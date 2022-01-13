//AREA OF CIRCLE USING CONSTRUCTOR.
import java.util.*;
public class area_of_circle {
    /**
     *
     */
    private static final int NEXT_INT = new Scanner(System.in).nextInt();

    public static void main(String[] args) {
        System.out.println("Enter radius of circle = ");
        int radius=NEXT_INT;
        new AREA(radius);
    }
    
}
class AREA{
    public AREA(int radius){
        final double pie=3.14159265359;
        System.out.println("Area of circle = "+(pie*radius*radius)+" square unit.");
    }
}
