package main.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import main.model.*;


public class ListingServiceImpl implements ListingService {
    
    public final Map<String,Listing> listingDatabase=new HashMap<>();

    @Override
    public Listing createListing(String title, String description, Location location, double price, List<String> amenities, Availability availability) {
        String listingId= UUID.randomUUID().toString();
        Listing listing=new Listing(listingId,title,description,location,price,amenities,availability);
        listingDatabase.put(listingId,listing);
        return listing;
    }

    @Override
    public Listing getListing(String listingId) {
        return listingDatabase.get(listingId);
    }

    @Override
    public void updateListing(String listingId, String title, String description, Location location, double price, List<String> amenities, Availability availability) {
        Listing listing=listingDatabase.get(listingId);
        if(listing==null){
            throw new IllegalArgumentException("No listing found with listingId: "+listingId);
        }
        listing.setTitle(title);
        listing.setDescription(description);
        listing.setPrice(price);
       
    }

    
}
