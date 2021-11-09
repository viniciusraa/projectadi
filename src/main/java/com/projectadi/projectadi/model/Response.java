package com.projectadi.projectadi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public class Response {

        public List<Weather> weather;
        public Main main;
        public Wind wind;
        public Sys sys;
        public String name;

        public List<Weather> getWeather() {
                return weather;
        }

        public void setWeather(List<Weather> weather) {
                this.weather = weather;
        }

        public Main getMain() {
                return main;
        }

        public void setMain(Main main) {
                this.main = main;
        }

        public Wind getWind() {
                return wind;
        }

        public void setWind(Wind wind) {
                this.wind = wind;
        }

        public Sys getSys() {
                return sys;
        }

        public void setSys(Sys sys) {
                this.sys = sys;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }
}
