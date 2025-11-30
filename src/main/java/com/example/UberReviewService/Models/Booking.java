package com.example.UberReviewService.Models;

import jakarta.persistence.*;
import lombok.*;


import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Booking extends BaseModel {
    @OneToOne (cascade ={CascadeType.PERSIST,CascadeType.REMOVE})//1:1 relationship of booking and review
    private Review review;
    @Enumerated(value= EnumType.STRING)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id")
    private Driver driver;
    private BookingStatus bookingStatus;//its not a specific property ,its just a ENUM
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date startTime;
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date endTime;
    private Long totalDistance;

    @ManyToOne
    private Passenger passenger;

}
