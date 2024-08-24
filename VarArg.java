class VarArgDemo{
    static void fun(int... a)
    {
        System.out.println("Number of arguments: "
                           + a.length);
 
        // using for each loop to display contents of a
        for (int i : a){
            System.out.println(i);
        }
        System.out.println();
    }
}

class VarArg{
    public static void main(String[] args) {
        //VarArgDemo o1=new VarArgDemo();
        VarArgDemo.fun(10,10,20);
        
    }


}