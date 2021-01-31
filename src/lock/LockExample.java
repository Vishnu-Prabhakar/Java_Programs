package lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrintDemo {
	   private final Lock queueLock = new ReentrantLock();
	   public void print() {
	      queueLock.lock();
	      try {
	         Long duration = (long) (Math.random() * 10000);
	         System.out.println(Thread.currentThread().getName() 
	            + "  Time Taken " + (duration / 1000) + " seconds.");
	         Thread.sleep(duration);
	      } catch (InterruptedException e) {
	         e.printStackTrace();
	      } finally {
	         System.out.printf(
	            "%s printed the document successfully.\n", Thread.currentThread().getName());
	         queueLock.unlock();
	      }
	   }
	}

	class ThreadDemo extends Thread {
	   PrintDemo  printDemo;
	   ThreadDemo(String name,  PrintDemo printDemo) {
	      super(name);
	      this.printDemo = printDemo;
	   }   
	   @Override
	   public void run() {
	      System.out.printf(
	         "%s starts printing a document\n", Thread.currentThread().getName());
	      printDemo.print();
	   }
	}

	public class LockExample {

	   public static void main(String args[]) {
	      PrintDemo PD = new PrintDemo();

	      ThreadDemo t1 = new ThreadDemo("Thread - 1 ", PD);
	      ThreadDemo t2 = new ThreadDemo("Thread - 2 ", PD);
	      ThreadDemo t3 = new ThreadDemo("Thread - 3 ", PD);
	      ThreadDemo t4 = new ThreadDemo("Thread - 4 ", PD);

	      t1.start();
	      t2.start();
	      t3.start();
	      t4.start();
	   }
	}

	
	/*A synchronized block is fully contained within a method – we can have Lock API’s lock() and unlock() operation in separate methods
	A synchronized block doesn’t support the fairness, any thread can acquire the lock once released, no preference can be specified. We can achieve fairness within the Lock APIs by specifying the fairness property. It makes sure that longest waiting thread is given access to the lock
	A thread gets blocked if it can’t get an access to the synchronized block. The Lock API provides tryLock() method. The thread acquires lock only if it’s available and not held by any other thread. This reduces blocking time of thread waiting for the lock
	A thread which is in “waiting” state to acquire the access to synchronized block, can’t be interrupted. The Lock API provides a method lockInterruptibly() which can be used to interrupt the thread when it’s waiting for the lock*/
	
	
//	
//	void lock() – acquire the lock if it’s available; if the lock isn’t available a thread gets blocked until the lock is released
//	void lockInterruptibly() – this is similar to the lock(), but it allows the blocked thread to be interrupted and resume the execution through a thrown java.lang.InterruptedException
//	boolean tryLock() – this is a non-blocking version of lock() method; it attempts to acquire the lock immediately, return true if locking succeeds
//	boolean tryLock(long timeout, TimeUnit timeUnit) – this is similar to tryLock(), except it waits up the given timeout before giving up trying to acquire the Lock
//	void unlock() – unlocks the Lock instance
	
	
	