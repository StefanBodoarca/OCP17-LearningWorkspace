package ch13_concurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ex4();
    }

    public static void ex4() {
        var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for(Object key : foodData.keySet()) {
            foodData.remove(key);
            System.out.println(key);
        }
    }

    public static void printHello(Lock lock) throws InterruptedException {
        try {
            lock.lock();
            Thread.sleep(500);
            System.out.println("Hello");
        } finally {
            lock.unlock();
        }
    }

    public static void ex3() throws InterruptedException {
        Lock lock = new ReentrantLock();

        new Thread(() -> {
            try {
                printHello(lock);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }).start();

        Thread.sleep(1000);
        if(lock.tryLock()) {
            try {
                System.out.println("lock obtained, entering protected code");
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println("unable to acquire lock, doing something else");
        }
    }

    public static void ex2() {
        int a = 1;
        int b = 1;

        int x = ++a; //pre-increment
        System.out.println("x= " + x); //2
        System.out.println("a= " + a); //2

        int y = b++; //post-increment
        System.out.println("y= " + y); //1
        System.out.println("b= " + b); //2
    }

    public static void ex1() {
        var service = Executors.newSingleThreadExecutor();
        AtomicInteger sum = new AtomicInteger();

        try {
            Future<?> result = service.submit(() -> {
                sum.set(30 + 11);
            });
            result.get(); //waiting for the result
            System.out.println("Done = " + result.isDone());
            System.out.println("Sum = " + sum);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            service.shutdown();
        }
    }
}
