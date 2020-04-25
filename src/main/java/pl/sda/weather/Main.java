package pl.sda.weather;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Location location = new Location("Poznan", "Poland");
        Request request = new Request("abcd", "PoznanWLKP");
        ObjectMapper mapper = new ObjectMapper();
        Weather weather = new Weather(23.1,"Poznan", request, location);
        System.out.println(weather.getTemperature());
        weather.setTemperature(31.1);
        System.out.println(weather.getTemperature());
        mapper.writeValue(new File("data.json"), weather);
        Book book = new Book("5th element", 350);
        System.out.println(book.getNoOfPages());
        book.setNoOfPages(420);
        System.out.println(book.getNoOfPages());
        mapper.writeValue(new File("data1.json"), book);
        Weather readWeather = mapper.readValue(new File("data.json"), Weather.class);
        System.out.println(Weather.class);
    }
}
