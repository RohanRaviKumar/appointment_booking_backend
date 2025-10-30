package com.example.appointment_booking_backend.repository;

import com.example.appointment_booking_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
