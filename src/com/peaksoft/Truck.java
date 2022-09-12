package com.peaksoft;

public class Truck {
    private int id;
    private String name;
    private Drive drive;
    private Status status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Drive getDrive() {
        return drive;
    }

    public void setDrive(Drive drive) {
        this.drive = drive;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static Truck makeCar(int id, String name, Drive drive, Status state) {
        Truck car = new Truck();
        car.id = id;
        car.name = name;
        car.drive = drive;
        car.status = state;
        return car;
    }

    @Override
    public String toString() {
        return "" + id +
                " |" + name +
                "|" + drive +
                "       |" + status ;
    }
}
