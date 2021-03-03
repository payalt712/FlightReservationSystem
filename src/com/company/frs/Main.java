package com.company.frs;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {
        Passenger p=new Passenger("Payal Tiwari","9876543210","payalt712@gmail.com","20A, Shakti Nagar", "Jabalpur","Madhya Pradesh", 482001);
        Flight f1= new Flight("JbpToDel","50136","Vistara",200,100);
        Flight f2= new Flight("DelToDubai","44201","Vistara",250,100);

        Ticket regularTicket= new RegularTicket("ABC12035D","Delhi","Jabalpur","2021-02-15T14:30:00","2021-02-15T16:50:00","45E", false, 5000f, p,f1,"Cold Coffee with Peri Peri Fries" );
        Ticket touristTicket=new TouristTicket("ABC15523C","Dubai","Delhi", "2021-02-16T08:55:00", "2021:02:16T16:50:00", "33F", false, 250000f,p,f2, "Grand Hyatt,Near Sheikh Rashid Rd", new String[]{"1", "2", "3", "4"});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);

        //printTicketDetails1(regularTicket, p, f1);
        //printTicketDetails1(touristTicket,p, f2);


    }

    private static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

   /* private static void printTicketDetails1(Ticket ticket, Passenger p, Flight f) {
        System.out.println( p.getContact()+ "\nFrom: "+ticket.getFrom()+ " To: "+ticket.getTo()+ "\nSeat Number: "+ticket.getSeatNumber()+ " Flight: "+f.getFlightNumber()+" "+f.getFlightName()+ "\nDeparture: "+ticket.getDepartureDetails()+" Arrival: "+ticket.getArrivalDetails() + "\n");
    } */
}
