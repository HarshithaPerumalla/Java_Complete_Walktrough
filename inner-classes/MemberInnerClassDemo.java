
// static declarations inside a inner classes have been supported only from Java 16 aand above.
class Outer{
    class Inner{
        public void display(){
            System.out.println("method in inner class");
        }
        public static void main(String[] args) {
            System.out.println("Inner class main method");
        }
    }
    public static void main(String[] args) {
        System.out.println("outer main method");
    }
}
class MemberInnerClassDemo{
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i= o.new Inner();
        Outer.Inner.main(args);
        Outer.main(args);
        i.display();
        
    }
}
