package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class SearchingFlight {

    private Map<String, Boolean> mapOfFlight = new HashMap<>();

    public SearchingFlight() {
        mapOfFlight = airportDataBase();
    }

    private Map<String, Boolean> airportDataBase() {
        Map<String, Boolean> airportMap = new HashMap<>();

        airportMap.put("Krakow", false);
        airportMap.put("Warszawa", true);
        airportMap.put("Radom", false);

        return airportMap;
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException{

        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    private boolean findAirport(String airport) throws RouteNotFoundException{
        if(mapOfFlight.containsKey(airport)){
            return mapOfFlight.get(airport);
        } else {
            throw new RouteNotFoundException("Airport does not exist");
        }
    }
}
