package com.yanaguseva.service;

import com.github.fedy2.weather.YahooWeatherService;
import com.github.fedy2.weather.data.Channel;
import com.github.fedy2.weather.data.unit.DegreeUnit;

import javax.xml.bind.JAXBException;
import java.io.IOException;

public class WeatherService {

    public Channel getWeather() {
        try {
            YahooWeatherService service = new YahooWeatherService();
            return service.getForecastForLocation("Saint-Petersburg", DegreeUnit.CELSIUS).first(1).get(0);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}