package com.company;

public class Main {

    public static void main(String[] args) {

        Worker[] workers = new Worker[5];
        workers[0] = new Worker(83629, "Maier");
        workers[1] = new Worker(63729, "Huber");
        workers[2] = new Worker(93820, "Rieger");
        workers[3] = new Worker(38271, "Berger");
        workers[4] = new Worker(20392, "Duller");

        for(Worker worker : workers) {
            System.out.println(worker);
        }
    }
}
