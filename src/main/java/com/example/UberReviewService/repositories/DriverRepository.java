package com.example.UberReviewService.repositories;
import com.example.UberReviewService.Models.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
public interface DriverRepository extends JpaRepository<Driver, Long> {

    Optional<Driver> findByIdAndLicenseNumber(Long id, String licenseNumber);

    List<Driver> findAllByIdIn(List<Long> driverIds);
}



//    @Query(nativeQuery=true, value="SELECT*FROM driver WHERE id = :id AND license_number = :license")
//    CustomDriver rawFindByIdAndLicenseNumber(Long id , String license);

//RESEARCH THE CONCEPTS THAT U HAVE COMMENTED
//    @Query("SELECT d from  driver as d  WHERE d.id = :id AND d.licensenumber = :ln")
//    Optional<driver> hqlFindByIdAndLicenseNumber(Long id , String ln);
//   @Query("SELECT new com.example.UberReviewService.Models.CustomDriver(d.id,d.name) FROM driver d WHERE d.licenseNumber=:license AND d.id = :id")
//   CustomDriver hqlFindByIdAndLicense(String license,Long id);




