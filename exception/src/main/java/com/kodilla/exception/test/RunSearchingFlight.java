package com.kodilla.exception.test;

public class RunSearchingFlight {
    public static void main(String[] args) throws Exception {

        Flight flight = new Flight("Warszawa", "Krakow");
        Flight flight1 = new Flight("Krakow", "Radom");
        Flight flight2 = new Flight("Paris", "Radom");

        SearchingFlight searchingFlight = new SearchingFlight();


        try{
            boolean existFlight = searchingFlight.findFlight(flight);
            System.out.println("Flight: Warszawa - Krakow: " + existFlight);
        } catch (RouteNotFoundException e){
            System.out.println("Please enter a other airport!");
        }

        try{
            boolean notExistFlight = searchingFlight.findFlight(flight2);
            System.out.println("Flight: Paris - Radom: " + notExistFlight);
        } catch (RouteNotFoundException e){
            System.out.println("Please enter a other airport!");
        }
    }

}
