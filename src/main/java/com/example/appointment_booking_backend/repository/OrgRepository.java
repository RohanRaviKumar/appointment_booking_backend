package com.example.appointment_booking_backend.repository;

import com.example.appointment_booking_backend.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgRepository extends JpaRepository<Organization, Long> {
}
