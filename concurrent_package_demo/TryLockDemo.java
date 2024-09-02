// instead of using synchronized method / block , we can use reentrantlock

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class Display{

    ReentrantLock l= new ReentrantLock();

    public void wish(String name) throws InterruptedException {

        if(l.tryLock(1000,TimeUnit.MILLISECONDS)){
            
            for(int i=0;i<10;i++){
                System.out.println("Good morning: ");
                try{
                    Thread.sleep(200);
                }
                catch(InterruptedException e){
                    System.out.println("exception caught");
                }
                System.out.println(i+name);
            }
            l.unlock();
        }
        else{
            System.out.println("cannot acquire lock "+name);
        }

    }
}
class MyThread extends Thread{
    Display d;
    String name;
    MyThread(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run() {
        try{
            d.wish(name);
        }
        catch(InterruptedException e){
            System.out.println("exception caught");
        }
    }
}

class TryLockDemo{
    public static void main(String[] args) {
        Display d1=new Display();
        MyThread t1=new MyThread(d1,"Java");
        MyThread t2=new MyThread(d1,"Java Demo"); // two threads
        t1.start();
        t2.start();
    }
}