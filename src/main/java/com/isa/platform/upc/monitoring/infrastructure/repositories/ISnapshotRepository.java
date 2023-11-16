package com.isa.platform.upc.monitoring.infrastructure.repositories;

import com.isa.platform.upc.monitoring.domain.entities.Snapshot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ISnapshotRepository extends JpaRepository<Snapshot, Long> {
    Optional<Snapshot> findBySnapshotId(String snapshotId);
}
