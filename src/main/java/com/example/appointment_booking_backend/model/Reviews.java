package com.example.appointment_booking_backend.model;

import jakarta.persistence.*;

@Entity
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ReviewID;

    @ManyToOne
    @JoinColumn(name="UserID", referencedColumnName = "UserID", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name="OrgID", referencedColumnName = "OrgID", nullable = false)
    private Organization organization;

    private int rating;
    private String description;
    private int reviewType;

    public Long getReviewID() {
        return ReviewID;
    }

    public void setReviewID(Long reviewID) {
        ReviewID = reviewID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getReviewType() {
        return reviewType;
    }

    public void setReviewType(int reviewType) {
        this.reviewType = reviewType;
    }
}
