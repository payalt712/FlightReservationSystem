package com.company.frs;
import java.time.LocalDateTime;

public class RegularTicket extends Ticket {
    private String specialServices;

    public RegularTicket(String pnr, String to, String from, String departureDetails, String arrivalDetails, String seatNumber, boolean isCancelled, float ticketPrice, Passenger passenger, Flight flight, String specialServices) {
        super(pnr, to, from, departureDetails, arrivalDetails, seatNumber, isCancelled, ticketPrice, passenger, flight);
        this.specialServices= specialServices;
    }

    public String getSpecialServices() {
        return specialServices;
    }
    public void setSpecialServices(String specialServices){
        this.specialServices=specialServices;
    }
}
