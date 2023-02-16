package DesignPattern.FactoryDesign;

import DesignPattern.FactoryDesign.com.phone.Android;
import DesignPattern.FactoryDesign.com.phone.OS;
import DesignPattern.FactoryDesign.com.phone.OperatingSystemFactory;

public class FactoryMain {

    public static void main(String[] args) {

        OperatingSystemFactory osf=new OperatingSystemFactory();
        OS obj=osf.getInstance("");//open=android,closed=ios,nothing=windows
        obj.specs();
    }

}
