package code.academy;

import java.util.Objects;

public class Address {
    public final City city;

    Address(City city){
        this.city = Objects.requireNonNullElseGet(city, () -> new City("NOT DEFINED"));
    }

    public City getCity() {
        return city;
    }

}
