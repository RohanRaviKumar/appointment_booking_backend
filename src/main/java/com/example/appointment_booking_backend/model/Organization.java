package com.example.appointment_booking_backend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long OrgID;
    private String OrgName;
    private int ServiceType;
    private String address;

    @Temporal(TemporalType.DATE)
    private Date openTime;
    @Temporal(TemporalType.DATE)
    private Date closeTime;

    public Long getOrgID() {
        return OrgID;
    }

    public void setOrgID(Long orgID) {
        OrgID = orgID;
    }

    public String getOrgName() {
        return OrgName;
    }

    public void setOrgName(String orgName) {
        OrgName = orgName;
    }

    public int getServiceType() {
        return ServiceType;
    }

    public void setServiceType(int serviceType) {
        ServiceType = serviceType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }
}
