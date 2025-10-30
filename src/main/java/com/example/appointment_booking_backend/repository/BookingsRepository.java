package com.example.appointment_booking_backend.repository;

import com.example.appointment_booking_backend.model.Bookings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingsRepository extends JpaRepository<Bookings, Long> {
}
