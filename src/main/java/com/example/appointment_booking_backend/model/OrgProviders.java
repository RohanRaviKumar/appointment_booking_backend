package com.example.appointment_booking_backend.model;

import jakarta.persistence.*;

@Entity
public class OrgProviders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long OrgProviderId;

    @ManyToOne
    @JoinColumn(name="OrgID", referencedColumnName = "OrgID", nullable = false)
    private Organization organization;

    @ManyToOne
    @JoinColumn(name="ProviderID", referencedColumnName = "UserID", nullable = false)
    private User user;

    public Long getOrgProviderId() {
        return OrgProviderId;
    }

    public void setOrgProviderId(Long orgProviderId) {
        OrgProviderId = orgProviderId;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
