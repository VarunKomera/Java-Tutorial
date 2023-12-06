package com.anudip.learning;

public class MultiThreadGreeting1 {

	class GreetingThread extends Thread {
	    private String[] names;

	    public GreetingThread(String[] names) {
	        this.names = names;
	    }

	    @Override
	    public void run() {
	        displayGreeting(names);
	    }

	    private void displayGreeting(String[] names) {
	        for (String name : names) {
	            System.out.println("Welcome, " + name + "!");
	        }
	    }
	}

	

}
