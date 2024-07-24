package com.exercises;

// Custom thread class
public class CustomThread extends Thread {
    private String name;
    private int startingNumber;

    public CustomThread(String name, int startingNumber) {
        this.name = name;
        this.startingNumber = startingNumber;
    }

    @Override
    public void run() {
        // Code to be executed in the thread
        while (startingNumber <= 10){
            System.out.println(name + ": " + startingNumber);
            startingNumber+=2;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}