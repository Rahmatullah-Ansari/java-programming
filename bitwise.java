//bitwise operator.
public class bitwise {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println(a&b);//AND bitwise.
        System.out.println(a|b);//OR bitwise.
        System.out.println(a^b);//XOR bitwise.
        System.out.println(~a);//complement bitwise.
        System.out.println(a<<2);//left shift.
        System.out.println(b>>2);//right shift.
        System.out.println(a>>>2);//zero fill right shift.
    }
}
