package com.example.UberReviewService.repositories;
import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository


public interface  BookingRepository extends JpaRepository<Booking,Long> {
    List<Booking> findAllBydriverId(Long DriverId);
    List<Booking> findAllByDriverIn(List<Driver> Drivers);
}
