import java.util.Scanner;

class NoMoneyException extends Exception{
    NoMoneyException(String message){
        super(message);
    }

}

class ThrowKeyword{
    public static void main(String[] args) {
        int balance=0;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter money to deposit:");
        int money=s1.nextInt();
        s1.close();
        try{
            if(money<=0){
                throw new NoMoneyException("InSufficient Balance, cannot continue");
    
            }
            //code directly switches to catch when exception is occured, hence it doesnot execute further lines in try block.
            balance+=money;
            System.out.println(balance+" rupees deposited");
        }
        catch(NoMoneyException e){
            System.out.println(e.getMessage());
        }

        
    }
}