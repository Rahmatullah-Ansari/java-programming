//EVEN OR ODD experiment-4.
class even_odd{
    public static void main(String...e) {
        int num=Integer.parseInt(e[0]);
        if(num % 2 == 0){
            System.out.println("Number is = "+num);
            System.out.println("Number is EVEN.");
        }else{
            System.out.println("Number is = "+num);
            System.out.println("Number is ODD.");
        }
    }
}