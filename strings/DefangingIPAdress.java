package strings;

public class DefangingIPAdress {

//    1108. Defanging an IP Address
    public static void main(String[] args) {
        String address="1.1.1.1";
        System.out.println(defangIPaddr(address));
        String address1="255.100.50.0";
        System.out.println(defangIPaddr(address1));
    }

    private static String defangIPaddr(String address) {
        address=address.replace(".","[.]");
        return address;
    }

}
