//2. * Anonymous inner class that implements a interface

class AnonymousInterface{
    public static void main(String[] args) {
        Runnable r=new Runnable() {
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println(i+"child thread");
                }
            }
        };
        Thread t1= new Thread(r);
        t1.start();
        for(int i=0;i<10;i++){
            System.out.println(i+"parent thread");
        }
    }
}