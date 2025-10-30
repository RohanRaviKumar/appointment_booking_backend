package com.example.appointment_booking_backend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class ProviderHolidays {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long PHolID;

    @ManyToOne
    @JoinColumn(name="UserID", referencedColumnName = "UserID", nullable = false)
    private User user;

    @Temporal(TemporalType.DATE)
    private Date date;

    public Long getPHolID() {
        return PHolID;
    }

    public void setPHolID(Long PHolID) {
        this.PHolID = PHolID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
