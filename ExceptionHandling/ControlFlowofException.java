class ControlFlowDemo{
    public void demo(){
        try{
            System.out.println("Statement 1");
            System.out.println(10/0);// if exception occured here, rest of the try block is not executed
            System.out.println("Statement 3");
        }
        catch(ArithmeticException e){
            System.out.println("Statement 4");
        }
        catch(Exception e){
            System.out.println("another exception handled");
        }
        System.out.println("Statement 5 ");
    }
}
class ControlFLowofException{
    public static void main(String[] args) {
        ControlFlowDemo o1 = new ControlFlowDemo();
        
        // Call the demo method on the instance
        o1.demo();
    }
}