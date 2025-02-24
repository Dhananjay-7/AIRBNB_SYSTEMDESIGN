package main.Service;

import java.util.Collection;
import java.util.List;
import main.model.Availability;
import main.model.Listing;
import main.model.Location;

public interface ListingService {
    Listing createListing(String title, String description, Location location, double price, List<String> amenities, Availability availability);
    Listing getListing(String listingId);
    void updateListing(String listingId, String title, String description, Location location, double price, List<String> amenities, Availability availability);
    Collection<Listing> getAllListings();
 
}
