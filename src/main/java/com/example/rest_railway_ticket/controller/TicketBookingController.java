package com.example.rest_railway_ticket.controller;
import com.example.rest_railway_ticket.model.Passenger;
import com.example.rest_railway_ticket.model.Ticket;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/irctc")
public class TicketBookingController {

    Map<String, Ticket> ticketBooking = new HashMap<>();


    @PostMapping(value = "/addPassenger",consumes = {"application/json","application/xml"},produces = {"application/xml","application/json"})
    public Ticket bookTicket(@RequestBody Passenger p) {
        Ticket t=new Ticket();
        Random rand=new Random();
        String ticketId = String.valueOf(rand.nextInt(100000));
        System.out.println(ticketId+"*****************************");
        t.setTrainNumber(p.getTrainNumber());
        t.setTicketPrice("500");
        t.setFrom(p.getFrom());
        t.setTo(p.getTo());
        t.setTicketStatus("Booked");
        t.setPassengerName(p.getFirstName());
        t.setTicketId(ticketId);
        ticketBooking.put(ticketId, t);
        return t;
    }


    @GetMapping(value = "/ticketId/{ticketId}" ,produces = {"application/json","application/xml"})
    public Ticket getTicket(@PathVariable String ticketId) {
        return ticketBooking.get(ticketId);
    }

}
