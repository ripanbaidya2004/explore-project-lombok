package com.ripan.learnprojectlombok;

import lombok.Synchronized;

/**
 * @Synchronized
 * used to generate synchronized method or synchronized block
 * provide thread safety
 * it is alternative or traditional synchronized keyword which used in java
 * use private $lock object instead of this or the class instance.
 *
 */

public class SynchronizedExample {

    @Synchronized
    public void safeMethod(){
        System.out.println("thread safe method, executed by "+Thread.currentThread().getName());

        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}

// code if we do not use @Synchronized
/*
public class SynchronizedExample {

    private final Object $lock = new Object(); // Private lock object

    public void safeMethod() {
        synchronized ($lock) { // Synchronizes on the private lock object
            System.out.println("Thread-safe method execution by: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

 */