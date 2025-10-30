package com.example.appointment_booking_backend.repository;

import com.example.appointment_booking_backend.model.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewsRepository extends JpaRepository<Reviews, Long> {
}
