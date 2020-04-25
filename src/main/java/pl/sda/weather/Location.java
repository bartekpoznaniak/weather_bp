package pl.sda.weather;

public class Location {
    private String name;
    private String country;

    public Location(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public Location() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}
