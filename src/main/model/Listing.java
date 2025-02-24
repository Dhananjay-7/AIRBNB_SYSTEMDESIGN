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

    public Listing(String listingId, String title, String description, Location location, double price, List<String> amenities, Availability availability) {
        this.listingId = listingId;
        this.title = title;
        this.description = description;
        this.price = price;
        this.amenities = amenities;
        this.availability = availability;
        this.location =location;

    }

    public String getListingId() {
        return listingId;
    }

    public Availability getAvailability() {
        return availability;
    }

    




}
