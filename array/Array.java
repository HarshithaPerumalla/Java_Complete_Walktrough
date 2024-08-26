class ArrayTwoDimensional{
    public void setArray(){
        int[][] x={{1,2,3},{2,3,4,5,90}};
        System.out.println(x.length);

    }
}

class ArrayOneDimensional {
    int x[];
    int n;
    ArrayOneDimensional(int n){
        this.n=n;
        x=new int[n];
    }
    public void arrayInsert() {
        for(int i=0;i<n;i++){
            x[i]=i*2;
        }
        System.out.println(x.getClass().getName()); // arrays are objects hence it has corresponding class name
    }
    public void getArray(){
        for(int i=0;i<n;i++){
            System.out.println(x[i]);
        }
    }
}

class AnonymousArrayExample {

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new int[]{10, 20, 30}); // Anonymous array passed directly
    }
}



 class Array{

    public static void main(String[] args) {
        System.out.println(args.length);
        ArrayOneDimensional o1=new ArrayOneDimensional(5);
        o1.arrayInsert();
        o1.getArray();
        int[] array1=new int['a'];// int,char,byte,short are valid for array size
        System.out.println(array1.length);// cpmpiles perfectly but gives runtime expection at time of running

        ArrayTwoDimensional o2=new ArrayTwoDimensional();
        o2.setArray();

    }
}