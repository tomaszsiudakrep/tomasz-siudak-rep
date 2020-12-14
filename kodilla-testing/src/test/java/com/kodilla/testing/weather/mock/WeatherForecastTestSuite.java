/*package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito.mock;

public class WeatherForecastTestSuite {
    @Test
    public void testCalculateForecastWithMock() {
         //given
         Temperatures temperaturesMock = mock(Temperatures.class);

         WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
          //when
         int quantityOfSensors = weatherForecast.calculateForecast().size();
          //then
         Assertions.assertEquals(5, quantityOfSensors);
    }
}
*/