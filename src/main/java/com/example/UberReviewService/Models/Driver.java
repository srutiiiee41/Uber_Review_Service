package com.example.UberReviewService.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;
import java.util.ArrayList;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Driver extends BaseModel {
    private String name;
    @Column(nullable = false,unique = true)
    private String licenseNumber;
    @OneToMany(mappedBy ="driver",fetch = FetchType.LAZY)
    private List<Booking> bookings = new ArrayList<>();



}
