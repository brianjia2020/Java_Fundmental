package com.brian.JAVA_Fundmental.day15;

/**
 * 1. In developing, interface oriented programming
 * 
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //polymorphism
        computer.transferData(new Flash());
    }
}

class Computer {
    public void transferData(USB usb){
        usb.start();
        System.out.println("Detail of transferring data.");
        usb.stop();
    }
}

interface USB {
    //attributes: defined length,width,max_speed,min_speed
    void start();
    void stop();
}

class Flash implements USB{

    @Override
    public void start() {
        System.out.println("Flash is starting work");
    }

    @Override
    public void stop() {
        System.out.println("Flash is stopping work");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("Printer is starting to work");
    }

    @Override
    public void stop() {
        System.out.println("Printer is stopping work");
    }
}