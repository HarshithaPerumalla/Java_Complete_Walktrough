/*
 * solves probllems with synchronised keyword
 * advantages of concurrent package:
 * a) no deadlock situation
 * b) if t1,t2,t3 threads are waiting we can choose which thread to scedule unlike in traditional multi threading
 * c)it tries for lock. if lock is not available then it will perform alternative operations.

 * we have interface named lock
 * 
 * Important methods of lock interface:
 * 
    * void lock()-used to scquire lock, iflock is available then current thread will get that 
    * lock if lock is not available then it will wait until it gets the lock.

    * boolean trylock()-if lock is available then it acquires lock else it performs safe operations.
    *
    * lockInterruptibly()-
    *
    * void unlock()-used to release the lock. to call this method,compulsory current thread should be owner of the lock
    * otherwise we get IllegalMonitorStateException

 * Reentrantlock()- it is the implementation class of lock interface.
 * Direct child class of object.
 * IMportant methods:
 * void lock(), 
 * void bollean trylock(), 
 * lockInterruptibly(),
 * void unlock(),
 * getHoldcount()
 * getqueuelength()
 * isLOcked()
 * getOwner()
 */

import java.util.concurrent.locks.*;


class ReentrantLockDemo{
    public static void main(String[] args) {
        ReentrantLock l=new ReentrantLock();
        l.lock();
        l.lock();// can have multiple locks on same object
        System.out.println(l.isLocked());
        System.out.println(l.isHeldByCurrentThread());
        System.out.println(l.getQueueLength());
        l.unlock();
        System.out.println(l.getHoldCount());
        System.out.println(l.isLocked());
        l.unlock();
        System.out.println(l.isLocked());
        System.out.println(l.isFair());
    }
}