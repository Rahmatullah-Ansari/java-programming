class mthread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<3){
        System.out.println(0);
        i++;
        }
    }
}
class mthread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<3){
        System.out.println(1);
        i++;
        }
    }
}
class mthread3 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<3){
        System.out.println(2);
        i++;
        }
    }
}
class mthread4 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<2){
        System.out.println(3);
        i++;
        }
    }
}
public class multi_threading {
    public static void main(String[] args) {
        mthread1 m1 = new mthread1();
        mthread2 m2 = new mthread2();
        mthread3 m3 = new mthread3();
        mthread4 m4 = new mthread4();
        m1.start();
        m2.start();
        m3.start();
        m4.start();

    }
    
}
