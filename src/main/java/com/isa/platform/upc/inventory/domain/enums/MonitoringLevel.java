package com.isa.platform.upc.inventory.domain.enums;

public enum MonitoringLevel {
    ESSENTIAL_MONITORING(1),
    ADVANCE_MONITORING(2);

    private final int value;

    MonitoringLevel(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
