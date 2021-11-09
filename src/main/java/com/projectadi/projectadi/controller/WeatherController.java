package com.projectadi.projectadi.controller;


import com.projectadi.projectadi.model.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WeatherController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/weather")
    @ResponseBody
    public Response getWeather(@RequestParam String city) {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "," +  "&appid=3e827b3d7328be4a291bbeacf7d8a74f&units=metric&lang=pt_br";
        Response weather = this.restTemplate.getForObject(url, Response.class);
        return weather;
    }

//    @GetMapping("/")
//    public String renderPage() {
//        return "weather";
//    }

//    @GetMapping("/weather")
//    public Response getWeather() {
//        String url = "http://api.openweathermap.org/data/2.5/weather?q=guarulhos,sp,bra&appid=3e827b3d7328be4a291bbeacf7d8a74f&units=metric&lang=pt_br";
//        Response weather = this.restTemplate.getForObject(url, Response.class);
//        return weather;
//    }
}
