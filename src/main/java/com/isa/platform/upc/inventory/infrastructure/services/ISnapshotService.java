package com.isa.platform.upc.inventory.infrastructure.services;

import com.isa.platform.upc.monitoring.domain.entities.Snapshot;

public interface ISnapshotService {

    Snapshot addSnapshot(Snapshot snapshot);

}
