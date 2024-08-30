/*
 * Anonymous inner class- inner classes without name . 
 * only used for one time.
 * 
 * types:
 * Anonymous inner class that extend a class
 * Anonymous inner class that implements a interface
 * Anonymous inner class that defined inside arguments
 * 
 */
// 1. * Anonymous inner class that extend a class
 class A{
    public void display(){
        System.out.println("hello");
    }
    public void fun(){
        System.out.println("joke");
    }
 }
class AnonymousInnerClassDemo{
    public static void main(String[] args) {
        A o1=new A(){
            public void fun(){
                System.out.println("games");
            }
        };
        o1.fun();
        o1.display();
    }
}
