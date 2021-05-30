//implement thread by extending thread class.
class mythread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<50){
        System.out.println("Hello.");
        i++;
        }
    }
}
class mythread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<50){
        System.out.println("Good Morning sister!");
        i++;
        }
    }
}
public class thread1 {
    public static void main(String[] args) {
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();
        t1.start();
        t2.start();
        
    }
    
}
