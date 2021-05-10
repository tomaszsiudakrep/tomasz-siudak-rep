package com.kodilla.testing.weatherMock;

import com.kodilla.testing.weatherMock.Temperatures;
import com.kodilla.testing.weatherMock.WeatherForecast;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {


    @Mock
    private Temperatures temperaturesMock;


    @Test                                                                         // [11]
    void testCalculateForecastWithMock() {                                        // [12]
        //Given
//        Temperatures temperaturesMock = mock(Temperatures.class);

        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);                                       // [19]
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);      // [20]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);   // [21]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();       // [22]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                             // [23]
    }                                                                             // [24]


    @Test
    void testCalculateAverageTemperature() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.5);                                       // [16]
        temperaturesMap.put("Wroclaw", 26.0);                                      // [17]
        temperaturesMap.put("Warszawa", 24.5);                                     // [18]
        temperaturesMap.put("Gdansk", 27.5);                                       // [19]

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        double resultAvg = weatherForecast.calculateAvg();

        //Then
        Assertions.assertEquals(26.0, resultAvg);

    }

    @Test
    void testCalculateMedianWhenListSizeIsOdds() {
        //Given
        Map<String,Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.5);                                       // [16]
        temperaturesMap.put("Wroclaw", 26.0);                                      // [17]
        temperaturesMap.put("Warszawa", 24.5);                                     // [18]
        temperaturesMap.put("Gdansk", 27.5);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When

        double resultMedian = weatherForecast.calculateMedian();

        //Then
        //mediana = 26.0
        Assertions.assertEquals(26.0, resultMedian);

    }

    @Test
    void testCalculateMedianWhenListSizeIsEven() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 27.0);                                       // [16]
        temperaturesMap.put("Wroclaw", 26.0);                                      // [17]
        temperaturesMap.put("Warszawa", 24.5);                                     // [18]
        temperaturesMap.put("Gdansk", 27.5);
        temperaturesMap.put("Sopot", 27.0);

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double resultMedian = weatherForecast.calculateMedian();
        //Then
        Assertions.assertEquals(26.5, resultMedian);

    }


}