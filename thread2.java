//implement thread by runnable interface.
class mythread implements Runnable{
    int i=50;
    public void run(){
        while(i>0){
        System.out.println("Thread 1 is running.");
        i--;
        }
    }
}
class mythread_1 implements Runnable{
    public void run(){
        int i=50;
        while(i>0){
        System.out.println("Thread 2 is running.");
        i--;
        }
    }
}
public class thread2 {
    public static void main(String[] args) {
        mythread bullet1=new mythread();
        mythread_1 bullet2=new mythread_1();
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
