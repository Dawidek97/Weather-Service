package spring.weatherforecast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import spring.weatherforecast.service.CityModel;

@Controller
public class MainController {

    CityModel cm = new CityModel();

    @GetMapping("/weathers/search")
    public String search(@RequestParam(required = false) String city, ModelMap modelMap) {

            modelMap.put("weather", cm.cityModel(city));
        return "search";
    }
}
