package com.reservations;
import java.time.LocalDate;
public class Reservation {
    private LodgingHebergement lodging;
    private LocalDate startDate;
    private int durationInDays;

    public Reservation(LodgingHebergement lodging, LocalDate startDate, int durationInDays) {
        this.lodging = lodging;
        this.startDate = startDate;
        this.durationInDays = durationInDays;
    }

    public LodgingHebergement getLodging() {
        return lodging;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getDurationInDays() {
        return durationInDays;
    }
}