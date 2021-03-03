package com.company.frs;
import java.time.LocalDateTime;

public class TouristTicket extends Ticket{
    private String hotelAddress;
    private String[] selectedTouristLocation;

    public TouristTicket(String pnr, String to, String from, String departureDetails, String arrivalDetails, String seatNumber, boolean isCancelled, float ticketPrice, Passenger passenger, Flight flight, String hotelAddress, String[] selectedTouristLocation){
        super(pnr, to, from, departureDetails, arrivalDetails, seatNumber, isCancelled, ticketPrice, passenger, flight);
        this.hotelAddress=hotelAddress;
        this.selectedTouristLocation=selectedTouristLocation;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public void addTouristLocation(String location) {
        int index = -1;
        for (int i=0; i< selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i] == null) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            selectedTouristLocation[index] = location;
        }
    }

    public void removeTouristLocation(String location) {
        int index=-1;
        for (int i=0; i<selectedTouristLocation.length; i++) {
            if (selectedTouristLocation[i].equals(location)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            return;
        }
        for (int i=index; i< selectedTouristLocation.length-1; i++) {
            selectedTouristLocation[i] = selectedTouristLocation[i+1];
        }
        selectedTouristLocation[selectedTouristLocation.length-1] = null;
    }


}
