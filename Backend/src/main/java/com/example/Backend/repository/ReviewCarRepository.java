package com.example.Backend.repository;

import com.example.Backend.model.ReviewCar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewCarRepository extends JpaRepository<ReviewCar, Long> {
    Page<ReviewCar> findAllByCarId(Long carId, Pageable pageable);
}
