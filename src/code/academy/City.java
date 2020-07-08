package code.academy;

import java.util.Objects;

public class City {
    private String name;

    City(String cityName) {
        this.name = Objects.requireNonNullElse(cityName, "NOT DEFINED");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
