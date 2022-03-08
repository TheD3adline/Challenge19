package com.company;

public class Worker implements Comparable {

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

    @Override
    public int compareTo(Object o) {
        if (o instanceof Worker) {
            Worker other = (Worker) o;
            if(this.workerID < other.workerID)
                return -1;
            if(this.workerID > other.workerID)
                return 1;
            return 0;
        }
        return 0;
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
