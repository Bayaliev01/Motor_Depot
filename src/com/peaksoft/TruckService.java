package com.peaksoft;

import java.util.Scanner;

public class TruckService {
    static String truckName;
    static String drivename = null;
    Scanner scanner = new Scanner(System.in);
    static Drive drive = new Drive();
    static String vers;
    public void changetruck(Truck[] trucks , int truckId, Drive[] drives){
        for (int i = 0; i < trucks.length; i++) {
            if (trucks[i].getId() == truckId){
                if (trucks[i].getDrive().getName() == null){
                    vers = "";
                }else {
                    vers=trucks[i].getDrive().getName();
                }
                truckName = trucks[i].getName();
                System.out.println("ID - " + trucks[i].getId());
                System.out.println("TRUCK - " + trucks[i].getName());
                System.out.println("DRIVER - " + vers);
                System.out.println("STATUS - "+trucks[i].getStatus());
                if (trucks[i].getStatus().equals(Status.BASE)){

                }
            }
        }
    }
}
