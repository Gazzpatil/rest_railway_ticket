package com.example.rest_railway_ticket.model;


import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@XmlRootElement
@Data
public class Passenger {
    private String firstName;
    private String lastName;
    private int age;
    private String from;
    private String to;
    private String email;
    private String trainNumber;

}
