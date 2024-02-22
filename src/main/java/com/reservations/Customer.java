package com.reservations;
import java.util.ArrayList;
import java.util.List;
public class Customer {
    private String name;
    private List<Reservation> reservations;

    public Customer(String name) {
        this.name = name;
        this.reservations = new ArrayList<>();
    }

    public void addReservation(Reservation reservation) {
        reservations.add(reservation);
    }

    public String getName() {
        return name;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public String generateInvoice() {
        double totalAmount = 0;
        StringBuilder result = new StringBuilder("Invoice for " + getName() + "\n");

        for (Reservation reservation : reservations) {
            double reservationAmount = calculateReservationAmount(reservation);
            result.append("\t").append(reservation.getLodging().getName()).append("\t").append(reservationAmount).append("\n");
            totalAmount += reservationAmount;
        }

        result.append("Total amount: ").append(totalAmount);
        return result.toString();
    }

    private double calculateReservationAmount(Reservation reservation) {
        double nightlyRate = reservation.getLodging().getPricePerNight();
        int duration = reservation.getDurationInDays();

        return nightlyRate * duration;
    }
}
