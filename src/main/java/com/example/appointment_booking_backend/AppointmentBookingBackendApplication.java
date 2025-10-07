package com.example.appointment_booking_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppointmentBookingBackendApplication {

	public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(AppointmentBookingBackendApplication.class, args);
        Sample s = context.getBean(Sample.class);
        s.print();
	}

    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }

}
