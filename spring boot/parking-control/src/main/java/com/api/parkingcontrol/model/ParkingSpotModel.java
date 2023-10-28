package com.api.parkingcontrol.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name="TB_PARKING_SPOT")
public class ParkingSpotModel implements Serializable {
    private static  final long serialVersionUId= 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String parkingSpotNumber;
    private String licensePlateCar;
    private String brandCar;
    private String  modelCar;
    private String  colorCar;
    private String responsibleName;
    private String apartment;
    private String block;
    private LocalDateTime registrationDate;


}
