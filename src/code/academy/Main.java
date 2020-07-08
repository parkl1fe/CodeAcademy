package code.academy;

public class Main {

    public static void main(String[] args) {
        Address address = new Address(new City("Vilnius"));
        System.out.println(getCityName(address));
        System.out.println(getCityName(new Address(null)));
        System.out.println(getCityName(null));
        Address addressNull = new Address(new City(null));
        System.out.println(getCityName(addressNull));

    }

    public static String getCityName(Address address) {
        String errorMsg = "A city name is not defined";
        return address != null ? address.getCity().getName() : errorMsg;
    }
}
