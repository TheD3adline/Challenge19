package com.company;

public class Worker {

    private int workerID;
    private String lastName;

    public Worker(int workerID, String lastName) {
        this.workerID = workerID;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return lastName + " " + workerID;
    }

    public int getWorkerID() {
        return workerID;
    }

    public void setWorkerID(int workerID) {
        this.workerID = workerID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
