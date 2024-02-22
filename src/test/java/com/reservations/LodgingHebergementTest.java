package com.reservations;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

class LodgingHebergementTest {
    @Test
    void lesGettersFonctionnenentCorrectement() {
        LodgingHebergement lodging = new LodgingHebergement("Cozy Hotel", 1, 100.0);
        assertThat(lodging.getName()).isEqualTo("Cozy Hotel");
        assertThat(lodging.getType()).isEqualTo(1);
    }
    @Test
    void calculatePricePerNightFonctionneCorrectementPourTypesHebergementCorrects() {
        LodgingHebergement lodging1 = new LodgingHebergement("Hotel", 1, 100.0);
        LodgingHebergement lodging2 = new LodgingHebergement("AppartHotel", 2, 100.0);
        LodgingHebergement lodging3 = new LodgingHebergement("Maison", 3, 100.0);
        LodgingHebergement lodging4 = new LodgingHebergement("Camping", 4, 100.0);
        LodgingHebergement lodging5 = new LodgingHebergement("Chambre d'Hôte", 5, 100.0);

        assertThat(lodging1.getPricePerNight()).isEqualTo(100.0);
        assertThat(lodging2.getPricePerNight()).isEqualTo(150.0);
        assertThat(lodging3.getPricePerNight()).isEqualTo(200.0);
        assertThat(lodging4.getPricePerNight()).isEqualTo(50.0);
        assertThat(lodging5.getPricePerNight()).isEqualTo(75.0);
    }
}