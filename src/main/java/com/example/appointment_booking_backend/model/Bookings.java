package com.example.appointment_booking_backend.model;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;

@Entity
public class Bookings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingID;

    @ManyToOne
    @JoinColumn(name = "UserID", referencedColumnName = "UserID", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "ProviderID", referencedColumnName = "UserID", nullable = false)
    private User provider;

    @ManyToOne
    @JoinColumn(name="OrgID", referencedColumnName = "OrgID", nullable = false)
    private Organization organization;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "starttime", columnDefinition = "TIME")
    private Time startTime;

    @Column(name = "endtime", columnDefinition = "TIME")
    private Time endTime;


    public Long getBookingID() {
        return bookingID;
    }

    public void setBookingID(Long bookingID) {
        this.bookingID = bookingID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getProvider() {
        return provider;
    }

    public void setProvider(User provider) {
        this.provider = provider;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }
}