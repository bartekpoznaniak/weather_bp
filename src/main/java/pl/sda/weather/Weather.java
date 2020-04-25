package pl.sda.weather;

public class Weather {
    private Double temperature;
    private String city;
    private Request request;
    private Location location;

    public Weather(double temperature, String city, Request request, Location location ) {
        this.temperature= temperature;
        this.city = city;
        this.request = request;
        this.location = location;
    }

    public Weather() {
    }

    public Request getRequest() {
        return request;
    }

    public Location getLocation() {
        return location;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getTemperature() {
        return temperature;
    }

    public String getCity() {
        return city;
    }
}
