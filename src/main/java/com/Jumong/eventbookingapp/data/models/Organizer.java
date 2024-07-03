package com.Jumong.eventbookingapp.data.models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "organizers")
public class Organizer {

    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
