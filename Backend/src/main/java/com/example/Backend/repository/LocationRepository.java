package com.example.Backend.repository;

import com.example.Backend.model.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    Page<Location> findAll(Pageable pageable);

    Page<Location> findLocationByName(String name, Pageable pageable);

    Location findLocationByLatitudeAndLongitude(double latitude, double longitude);
}
