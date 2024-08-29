/*
 * THread group is used to maintain collection of thread which can also
 * have sub groups into a single unit
 * Advantage: common tasks are handled easily
 * every thread is a child of system thread.
 * evry thread group is the child of system group either directly or indirectly.
 * system group contain several system level threads like 
 * finalizer, refernce handler, single dispatcher.
 */

 /*

  * Thread group is a java class present in javal.lang package
  and is direct child class of object.

  */
  class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup g1 = new ThreadGroup("group 1");
        ThreadGroup parentGroup = g1.getParent(); // Get the parent ThreadGroup
        System.out.println(parentGroup.getName()); // Call getName() on the parentGroup object
    }
}