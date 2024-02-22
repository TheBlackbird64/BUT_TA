package com.reservations;

public class LodgingHebergement {
    private String lodgingName;
    private int lodgingType; // 1: Hotel, 2: AppartHotel, 3: Maison, 4:Camping, 5:Chambre_d_Hote
    private double lodgingPricePerNight;

    public LodgingHebergement(String name, int type, double basePricePerNight) {
        this.lodgingName = name;
        this.lodgingType = type;
        setPricePerNight(basePricePerNight);
    }

    public String getName() {
        return lodgingName;
    }

    public int getType() {
        return lodgingType;
    }

    public double getPricePerNight() {
        return lodgingPricePerNight;
    }

    private void setPricePerNight(double basePricePerNight) {
        switch(this.lodgingType) {
            case 1: this.lodgingPricePerNight = basePricePerNight*1; break;
            case 2: this.lodgingPricePerNight = basePricePerNight*1.5; break;
            case 3: this.lodgingPricePerNight = basePricePerNight*2; break;
            case 4: this.lodgingPricePerNight = basePricePerNight*0.5;break;
            case 5: this.lodgingPricePerNight = basePricePerNight*0.75;break;
            default: throw new RuntimeException("Illegal lodging type");
        }
    }
}
