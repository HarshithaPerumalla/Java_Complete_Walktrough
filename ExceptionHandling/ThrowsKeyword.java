/*
 * IN our program if there is a possibility of raising checked exception, then we have handle it , 
 * otherwise it will result in COmpile time Exception and terminates the code. 
 * Compiler checks for these Cchecked Exceptions.
 * throws keyword is used to handle checked Exceptions.
 * checked Exceptions are handled with try-catch and also able to handle with throws keyword.
 * throws keywords allows to deligate exception handling responsibility to caller method.
 * throws keyword can be used with CONSTRUCTOR AND METHOD but not for CLASSES.
 */

import java.io.IOException;
import java.io.PrintStream;

class ThrowsKeyword{
    public static void main(String[] args) throws IOException {
        PrintStream p1= new PrintStream("abc1.txt");
        p1.println("hello world");
        p1.close();
        System.out.println("handled"); 

        
    }
}