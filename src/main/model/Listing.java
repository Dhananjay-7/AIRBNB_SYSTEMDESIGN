package main.model;

import java.util.List;

public class Listing {
    private  String listingId;
    private  String title;
    private String description;
    private Location location;
    private double price;
    private List<String> amenities;
    private  Availability availability;

    public Listing(String listingId, String title, String description, Location location2, double price, List<String> amenities, Availability availability) {
        this.listingId = listingId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.amenities = amenities;
        this.availability = availability;
        this.location =location2;

    }

    public String getListingId() {
        return listingId;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setTitle(String title2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTitle'");
    }

    public void setDescription(String description2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDescription'");
    }

    public void setPrice(double price2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrice'");
    }

    




}
