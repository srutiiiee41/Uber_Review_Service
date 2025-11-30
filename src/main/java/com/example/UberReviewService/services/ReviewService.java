package com.example.UberReviewService.services;

import com.example.UberReviewService.Models.Booking;
import com.example.UberReviewService.Models.Driver;
import com.example.UberReviewService.repositories.BookingRepository;

import com.example.UberReviewService.repositories.ReviewRepository;
import com.example.UberReviewService.repositories.DriverRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;


import java.util.*;

@Service

public class ReviewService implements CommandLineRunner {
    private ReviewRepository reviewRepository;
    private final BookingRepository bookingRepository;
    private final DriverRepository driverRepository;//injection is done once we done driver repository


    public ReviewService(ReviewRepository reviewRepository,
                         BookingRepository bookingRepository,
                         DriverRepository driverRepository) {
        this.reviewRepository = reviewRepository;
        this.bookingRepository = bookingRepository;
        this.driverRepository = driverRepository;
    }

    @Override


    public void run(String args[]) throws Exception {
        System.out.println("********");
//        Review r = Review.builder()
//                .content("Amazing ride quality")
//                .rating(4.0).build();
//        Booking b = Booking
//                .builder()
//                .review(r)
//                .endTime(new Date())
//                .build();
//
//        reviewRepository.save(r);
//        bookingRepository.save(b);
//        System.out.println(r);
//        //code execute sql query
//        System.out.println(r.getId());
//
//        List<Review> reviews = reviewRepository.findAll();
//        for (Review review : reviews) {
//            System.out.println(r.getContent());
//        }
//        Optional<Booking> b = bookingRepository.findById(5L);
//        if(b.isPresent()){
//            bookingRepository.delete(b.get());
//        }
//        Optional<driver> Driver = DriverRepository.findById(1L);
//        if (Driver.isPresent()) {
//            System.out.println(Driver.get().getName());
//            List<Booking> b = Driver.get().getBookings();

//            List<Booking> bookings = bookingRepository.findAllBydriverId(1l);
//            for(Booking booking : b){
//                System.out.println(booking.getId());
//            }
//      }
        //Optional<Booking> b = bookingRepository.findById(1L);


//       reviewRepository.deleteById(2L);

//        CustomDriver d = DriverRepository.hqlFindByIdAndLicense("DL12121212",1L);
//        System.out.println(d.getName()); related to driver repository query
        List<Long> driverIds = new ArrayList<>(Arrays.asList(1L,2L));
        List<Driver> drivers = driverRepository.findAllByIdIn(driverIds);


        //List<Booking> bookings=bookingRepository.findAllByDriverIn(drivers);
        for(Driver driver : drivers){
            List<Booking> bookings= driver.getBookings();
            bookings.forEach(booking -> System.out.println());
        }


        }
    }



