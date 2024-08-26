/*
 * Tread class implements Runnable interface internally.
 *Runnable interfaceis present in java.lang and only presents run() method.
 implments runnable approch is preffered to implement threads in java 
 because inheritance is possible with runnable interface , performance, memory management. 
 */


class MyRunnable implements Runnable{
    public void run(){
        for(int i=1;i<11;i++){
            System.out.println(i+"runnable thread");
        }
    }
}
class ThreadusingRunnable{
    public static void main(String[] args) {
        MyRunnable r=new MyRunnable(); // Myrunnable has run() method
        Thread t1=new Thread(r);// Thread class has start() to start thread hence we have pass obj to thread class again
        t1.start();
        for(int i=1;i<11;i++){
            System.out.println(i+"main thread");
        }
    }
}
