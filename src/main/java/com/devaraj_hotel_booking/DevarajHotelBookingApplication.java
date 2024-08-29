package com.devaraj_hotel_booking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.devaraj_hotel_booking.model")
public class DevarajHotelBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevarajHotelBookingApplication.class, args);
	}

}
