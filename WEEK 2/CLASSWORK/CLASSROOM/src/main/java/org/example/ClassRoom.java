package org.example;

public class ClassRoom {
    private int noOfDecaDevs;
    private int noOfTables;
    private DecaDev decadevLead;

    public ClassRoom(int noOfDecaDevs, int noOfTables, DecaDev decadevLead) {
        this.noOfDecaDevs = noOfDecaDevs;
        this.noOfTables = noOfTables;
        this.decadevLead = decadevLead;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "noOfDecaDevs=" + noOfDecaDevs +
                ", noOfTables=" + noOfTables +
                ", decadevLead=" + decadevLead +
                '}';
    }

    public ClassRoom() {
    }

    public int getNoOfDecaDevs() {
        return noOfDecaDevs;
    }

    public void setNoOfDecaDevs(int noOfDecaDevs) {
        this.noOfDecaDevs = noOfDecaDevs;
    }

    public int getNoOfTables() {
        return noOfTables;
    }

    public void setNoOfTables(int noOfTables) {
        this.noOfTables = noOfTables;
    }

    public DecaDev getDecadevLead() {
        return decadevLead;
    }

    public void setDecadevLead(DecaDev decadevLead) {
        this.decadevLead = decadevLead;
    }
}
