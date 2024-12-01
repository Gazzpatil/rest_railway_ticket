package com.example.rest_railway_ticket.model;


import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
public class Ticket {
    private String ticketId;
    private String from;
    private String to;
    private String trainNumber;
    private String ticketPrice;
    private String ticketStatus;
    private String passengerName;
}
