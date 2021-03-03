package com.company.frs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Ticket {
    private String pnr, to, from, departureDetails, arrivalDetails, seatNumber;
    private boolean isCancelled;
    private Passenger passenger;
    private Flight flight;
    private float ticketPrice;

    public Ticket(String pnr, String to, String from, String departureDetails, String arrivalDetails, String seatNumber, boolean isCancelled, float ticketPrice, Passenger passenger, Flight flight){
        this.arrivalDetails=arrivalDetails;
        this.departureDetails=departureDetails;
        this.flight=flight;
        this.from=from;
        this.to=to;
        this.isCancelled=isCancelled;
        this.passenger=passenger;
        this.pnr=pnr;
        this.seatNumber=seatNumber;
        this.ticketPrice=ticketPrice;
    }

    public String checkStatus(){
        return isCancelled?"Cancelled":"Confirmed";
    }
    public void cancelTicket(){
        isCancelled=true;
    }
    public int journeyDuration(){
        LocalDateTime departureLocalDateTime = LocalDateTime.parse(departureDetails);
        LocalDateTime arrivalLocalDateTime = LocalDateTime.parse(arrivalDetails);
        return (arrivalLocalDateTime.getDayOfMonth() - departureLocalDateTime.getDayOfMonth()) * 24 +
                (arrivalLocalDateTime.getHour() - departureLocalDateTime.getHour());
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getDepartureDetails() {
        return departureDetails;
    }

    public void setDepartureDetails(String departureDetails) {
        this.departureDetails = departureDetails;
    }

    public String getArrivalDetails() {
        return arrivalDetails;
    }

    public void setArrivalDetails(String arrivalDetails) {
        this.arrivalDetails = arrivalDetails;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
