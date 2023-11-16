package com.isa.platform.upc.inventory.domain.entities;

import com.isa.platform.upc.inventory.domain.enums.MonitoringLevel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "brand")
    private String brand;

    @Column(name = "model")
    private String model;

    @Column(name = "serial_number")
    private String serialNumber;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "monitoring_level")
    private MonitoringLevel monitoringLevel;
}
