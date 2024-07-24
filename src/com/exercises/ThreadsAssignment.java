package com.exercises;

/**
 * @author agrawalshreya10
 * @since July 21, 2024
 * Problem Statement: Print numbers from 1 to 10 using two threads, where each thread prints alternate numbers.
 *
 */


public class ThreadsAssignment {
        public static void main(String[] args) {
            // Create two threads
            Thread oddThread = new CustomThread("Thread A", 1);
            Thread evenThread = new CustomThread("Thread B", 2);

            // Start the threads
            oddThread.start();
            evenThread.start();


    }
}