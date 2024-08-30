/*
 * THe main purpose of local inner class is to 
 * define repitativef unctionality of a method.
 * We can method local inner class inside both instance and static methods.
 * 
 * from method local inner class, we cannot access local variable of method in which we declare inner class.
 * if the local variable declared as final then we can access.
 * 
 * applicable modifiers on local inner claasses- final, abstract and strict fop only .
 */
class Outer{
    int z =10;
    public void sum(){
        final int a=67;
        class Inner{
            public void sumDemo(int x, int y){
                System.out.println("sum is"+x+y);
                System.out.println(a+"final variable");
                //System.out.println(z); gives error as non static veriable cant be accessed from statuic area scope

            }
        }
        Inner i= new Inner();
        i.sumDemo(10,90);
        i.sumDemo(89,89);
    }
    public static void substract(){
        class Inner2{
            public void substractDemo(int x,int y){
                System.out.println("substaction is "+(x-y));
            }
        }
        Inner2 i2 =new Inner2();
        i2.substractDemo(23, 90);
    }
}
class LocalInnerCLassDemo{
    public static void main(String[] args) {
        Outer o=new Outer();
        o.sum();
        Outer.substract();// static method accessed directly without using ocject

        
    }
}