
 class Display{
    public void wish(String name){
        for(int i=0;i<10;i++){
            System.out.println("Good morning: ");
            synchronized(this)
            {
                try{
                    Thread.sleep(200);
                }
                catch(InterruptedException e){
                    
                        System.out.println(name);
                    }
                    
            }

            }
            System.out.println(name);
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