package com.example.Backend.model;

import com.example.Backend.model.enums.CarImageType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "car_images")
public class CarImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length = 500)
    private String imageUrl;

    @Enumerated(EnumType.STRING)
    private CarImageType imageType;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @CreationTimestamp
    private LocalDateTime creationAt;

    @UpdateTimestamp
    private LocalDateTime updateAt;
}
