/*
 * 1.Ways to Define thread
 * 2.Getiing and setting Name of Thread
 * 3.Thread Priorities(Imp)
 * 4.Methods to prevent THread Execution
 * 5.Synchronization
 * 6.InterThread Communication
 * 7.Dead LOck
 * 8.Demon Thread
 * 9.MultiThreading enchancement
 */

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i+"executed by child thread");
        }
    }
    public int run(int a){// run overloading is possible, it is not a thread 
        System.out.println("oveloaded run");
        return a;
    }
}

 class MultiThreadIntro {
    public static void main(String[] args) {
        MyThread t1=new MyThread(); //Thread Instantiation, main thread strting child thread
        t1.start();//starting a thread, main thread starts child thread
        for(int i=0;i<10;i++){
            System.out.println(i+" executed by main thread");
        }
        t1.run(7);// start method only instantiates void run(), to run overloaded run() we have to call it seperately.
    }
 }