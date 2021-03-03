package com.company.frs;

public class Flight {
    private String flightName, flightNumber, airline;
    private int capacity, seatsBooked;

    public Flight(String flightName, String flightNumber, String airline, int capacity, int seatsBooked){
        this.flightName=flightName;
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.seatsBooked=seatsBooked;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }

    public String getFlightDetails(){
        return "Flight Name: "+flightName+ " Flight Number: "+flightNumber+ " Airline: " +airline+ " Capacity: "+capacity+ " Booked Seats: "+seatsBooked;
    }

    public boolean checkSeatAvailability(){
        return seatsBooked<capacity;
    }
    public void updateSeatsBooked(){
        seatsBooked++;
    }


}
