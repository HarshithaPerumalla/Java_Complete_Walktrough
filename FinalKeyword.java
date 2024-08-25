/*
 * Final is the modifier applicable for classes, methods and variable.
 * if a class is declared as final, it cannot be inherited.
 * If a method is declared as final it cannot be override.
 * If a variable is declared as final, it cannot be changed.
 */

final class FinalDemo{
    public static  void example(){
        final int x=10;
        // x=5; // gives error because final variables are unchangable
        System.out.println(x);
    }
    final public static void finalMethod(){
        System.out.println("hello");
    }
}
/*class FinalDemoChild extends FinalDemo{ // cannot inherit final class
    /*public static void finalMethod(){ // cannot override final method
        System.out.println("HI");
    }
}*/
class FinalKeyword{
    public static void main(String[] args) {
        FinalDemo.example();
    }

}