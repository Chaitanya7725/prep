package DesignPattern.Builder;

public class Shop {

    public static void main(String[] args) {
//        OLD
//        Phone p = new Phone("Android","qualcomm",2, 5.5, 3000);
//        System.out.println(p);

        Phone p = new PhoneBuilder().setOs("ios").setBattery(3000).setRam(2).getPhone();
        System.out.println(p);

    }
}
