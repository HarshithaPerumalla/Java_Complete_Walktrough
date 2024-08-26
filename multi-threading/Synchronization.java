/*
 * Synchronized is used for methods not for classes and variables.
 * 
 * when multiple threads are trying to operate on same java object then 
 * there is a chance of data inconsistency problem.
 * 
 * The synchronized keyword is used to control access to blocks of code or methods, 
 * ensuring that only one thread can execute the synchronized code at a time.
 * 
 * while a thread is executing synchronised method, no other synchro methods are
 * sllowed to run, but a normal method can be executed.
 * 
 * but we have to only specify normal methods which doesnt effect data inconsistency like read operation
 * // try the code with and without synchronised keyword
 */

class Display{
    public synchronized void wish(String name){
        for(int i=0;i<10;i++){
            System.out.println("Good morning: ");
            try{
                Thread.sleep(200);
            }
            catch(InterruptedException e){
                System.out.println(name);
            }
            System.out.println(name);
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
    public void run(){
        d.wish(name);
    }
}

class Synchronization{
    public static void main(String[] args) {
        Display d1=new Display();
        MyThread t1=new MyThread(d1,"Java");
        MyThread t2=new MyThread(d1,"Java Demo"); // two threads
        t1.start();
        t2.start();
    }
}