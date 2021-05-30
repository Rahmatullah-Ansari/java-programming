class fact_cmd{
    public static void main(String[] args) {
        int i,f=1;
        int num=Integer.parseInt(args[0]);
        for(i=1;i<=num;i++){
            f*=i;
        }
        System.out.println("Factorial = "+f);
    }
}
