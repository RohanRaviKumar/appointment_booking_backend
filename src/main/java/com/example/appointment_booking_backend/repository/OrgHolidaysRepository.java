package com.example.appointment_booking_backend.repository;

import com.example.appointment_booking_backend.model.OrgHolidays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrgHolidaysRepository extends JpaRepository<OrgHolidays, Long> {
}
