package com.example.appointment_booking_backend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class OrgHolidays {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long HolID;

    @ManyToOne
    @JoinColumn(name="OrgID", referencedColumnName = "OrgID", nullable = false)
    private Organization organization;

    @Temporal(TemporalType.DATE)
    private Date date;

    public Long getHolID() {
        return HolID;
    }

    public void setHolID(Long holID) {
        HolID = holID;
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
}
