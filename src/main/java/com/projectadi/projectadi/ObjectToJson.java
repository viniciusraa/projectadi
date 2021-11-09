package com.projectadi.projectadi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.projectadi.projectadi.model.Response;

import java.io.IOException;

public class ObjectToJson {
    public static void main (String[] a) {
        Response response =  new Response();
        response = getObjectData(response);
        ObjectMapper Obj = new ObjectMapper();
        try {
            String jsonStr = Obj.writeValueAsString(response);
            System.out.println(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static Response getObjectData(Response response) {
        response.setWeather(response.weather);
        response.setMain(response.main);
        response.setName(response.name);
        response.setSys(response.sys);
        response.setWind(response.wind);
        return response;
    }
}
