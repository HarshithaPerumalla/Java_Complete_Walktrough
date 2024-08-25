/*
 * Finally is used with try block to maintain clean up code.
 * It is executed irrespective of exception raised or not, handled or not.
 * 
 */

class FinallyKeyword{
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }
        finally{
            System.out.println("handled");
        }
    }
}