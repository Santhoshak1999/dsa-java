package Java.Threads;

class T extends Thread{
    public void run(){
        for(int i=1;i<=1000;i++){
            System.out.println("Hai");
        }
    }           
}
class U extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hello");
        }
    }   
}
public class demo{
    public static void main(String[] args) {
        T t = new T();
        U u = new U();
        t.start();
        u.start();//both started running in same time

    }
}

