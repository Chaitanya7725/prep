package DesignPattern.Builder;

public class Phone {

    private String os;
    private String processor;
    private int ram;
    private double screenSize;
    private int battery;

    public Phone(String os, String processor, int ram, double screenSize, int battery) {
        this.os = os;
        this.processor = processor;
        this.ram = ram;
        this.screenSize = screenSize;
        this.battery = battery;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", ram=" + ram +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                '}';
    }
}
