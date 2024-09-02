class MyRunnable implements Runnable{
    public void run(){
        System.out.println("run method of child thread");
    }
}
class setThreadName{
    public static void main(String[] args) {
        MyRunnable r1= new MyRunnable();
        Thread t1=new Thread(r1);
        t1.start();
        System.out.println("main thread name"+Thread.currentThread().getName());
        System.out.println("child thread name"+t1.getName());
        Thread.currentThread().setName("custom main thread");
        System.out.println("main thread name"+Thread.currentThread().getName());

    }
}