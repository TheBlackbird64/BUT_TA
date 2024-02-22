package com.reservations;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.assertThat;

class CustomerTest {
    @Test
    void lesGettersFonctionnentCorrectement() {
        Customer customer = new Customer("Yann");
        assertThat(customer.getName()).isEqualTo("Yann");
    }

    @Test
    void devraitGenererUneFactureCorrecte() {
        LodgingHebergement hotel = new LodgingHebergement("Luxury Hotel", 1, 100.0);
        LodgingHebergement apartment = new LodgingHebergement("City View Apartment", 2, 100.0);
        Customer customer = new Customer("John Doe");
        customer.addReservation(new Reservation(hotel, LocalDate.of(2022, 10, 1), 2));
        customer.addReservation(new Reservation(apartment, LocalDate.of(2022, 11, 15), 4));
        String invoice = customer.generateInvoice();
        assertThat(invoice).contains("Invoice for John Doe");
        assertThat(invoice).contains("Luxury Hotel\t200.0");
        assertThat(invoice).contains("City View Apartment\t600.0");
        assertThat(invoice).contains("Total amount: 800.0");
    }
}