/*
 * Attribute added in session() scope , it is available to that complete session()
 * until the user performs logout.
 * THread local- is used to define scope of the thread. provides thread local variables.
 * thread local helps in maintaing local copy of every thread seperately
 * 
 */

 class ThreadLocalDemo{
    public static void main(String[] args) {
        ThreadLocal<String> tl=new ThreadLocal<String>(){
            public String initialValue(){
                return "abc";
            }
        };
        System.out.println(tl.get());
        tl.set("dhoni");
        System.out.println(tl.get());
        tl.remove();
        System.out.println(tl.get());

    }
 }