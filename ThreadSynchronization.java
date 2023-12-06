package com.anudip.learning;

class SharedResource {
    synchronized void display(String message) {
        System.out.print("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("]");
    }
}

class Thread1 extends Thread {
    SharedResource sharedResource;

    public Thread1(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        sharedResource.display("Hello");
    }
}

class Thread2 extends Thread {
    SharedResource sharedResource;

    public Thread2(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void run() {
        sharedResource.display("World");
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread1 thread1 = new Thread1(sharedResource);
        Thread2 thread2 = new Thread2(sharedResource);

        // Starting both threads
        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Wait for thread1 to finish
            thread2.join(); // Wait for thread2 to finish
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception caught.");
        }
    }
}
