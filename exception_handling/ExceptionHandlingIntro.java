/*
 * EXCEPTION is a unexcepted situation which leads to abnormal flow of the program that results in termination of the program.
 * Example: NullPointerExeption, ArithmeticException:, IndexOutofBoundException
 * Objective: Graceful termination of the program
 * handling exception: refers to defining the alternative way to continue rest of the program
 */


 import java.io.IOException;
 import java.io.PrintWriter;
 
 class ExceptionDemo{
     public static void checkedException(){
 
         try{
             PrintWriter pwobject=new PrintWriter("abc.txt");
             pwobject.println("hello");
             pwobject.close();
             
 
         }
         catch(IOException e) {// catch block is only executedwhen there is a exception
             System.out.println("handled FileNotFOundException");
         }     
     }
       
 
 }
 
  class ExceptionHandlingIntro{
     public static void main(String[] args){
         try{
             doStuff();// step 3: Now JVM check here if main handled exception as main is responsible for calling doStuff and it is handled. hence code runs successfully.
         }
         catch(Exception e){
             System.out.println("main handled  Arithemetic exception");
         }
         //method callings
         ExceptionDemo.checkedException();
     }
     public static void doStuff(){
         doMore();// step2: JVM then goes here to check if the exception is handled here , as doStuff is the one who called doMore
     }
     public static void doMore(){
         System.out.println(10/0);// step1:actual exception is here  hence first jvm check here if exception is handled
     }
 
     
 }