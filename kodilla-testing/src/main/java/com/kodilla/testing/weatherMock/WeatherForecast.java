package com.kodilla.testing.weatherMock;


import java.util.*;
import java.util.stream.Collectors;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }
    double sumTemp = 0.0;
    double avg;
    double median;

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for(Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() + 1);
        }
        return resultMap;
    }

    public double calculateAvg() {

        for(Map.Entry<String, Double> temp: temperatures.getTemperatures().entrySet()){
            sumTemp += temp.getValue();
        }
        return avg = sumTemp / temperatures.getTemperatures().size();

    }

    public double calculateMedian() {
        median = 0.0;

        List<Double> temperaturesList = new ArrayList<>();


        for(Map.Entry<String, Double> temperature: temperatures.getTemperatures().entrySet()){
            temperaturesList.add(temperature.getValue());
        }


        Collections.sort(temperaturesList);


        if(temperaturesList.size() % 2 != 0.0){
            median = temperaturesList.get(temperaturesList.size() / 2);
        } else {
            median = (temperaturesList.get(temperaturesList.size() / 2) // drugi element listy do dodania
                    + temperaturesList.get((temperaturesList.size() / 2) - 1))  // pierwszy element do dodania
                    / 2;                                                         // dzielimy na dwa
        }

        return median;
    }




}