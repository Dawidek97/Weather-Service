package spring.weatherforecast.service;

import org.springframework.web.client.RestTemplate;
import spring.weatherforecast.model.WeatherModel;

public class CityModel {

    public String cityModel (String city) {
        String tempFinal;
        if (city != null) {
            String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=ef2028e98b54649bf1f4c4582631f350";
            RestTemplate restTemplate = new RestTemplate(); //Klasa ze Springa bierze nam Jsona i zamienia na Obkiet, tylko trzeba mu powiedzieć jak!
            WeatherModel weatherModel = restTemplate.getForObject(url, WeatherModel.class);
            tempFinal = weatherModel.getMain().getTempCelcius();

            return tempFinal;
        }
        return null;
    }
}
