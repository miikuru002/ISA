package com.isa.platform.upc.monitoring.domain.entities;

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
@Table(name = "snapshots")
public class Snapshot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "snapshot_id", nullable = false)
    private String snapshotId;

    @Column(name = "product_serial_number", nullable = false)
    private String productSerialNumber;

    @Column(name = "temperature", nullable = false)
    private double temperature;

    @Column(name = "energy", nullable = false)
    private double energy;

    @Column(name = "leakage", nullable = false)
    private int leakage;

}
