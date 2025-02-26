package main.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import main.model.Listing;

public class SearchServiceImpl implements SearchService {
    private final ListingService listingService;

    
    public  SearchServiceImpl(ListingService listingService) {

        this.listingService = listingService;
    }

    @Override
    public List<Listing> searchListings(String city, LocalDate startDate, LocalDate endDate, double minPrice, double maxPrice) {
        return listingService.getAllListings().stream()
            .filter(l -> l.getLocation().getCity().equalsIgnoreCase(city))
            .filter(l -> l.getPrice() >= minPrice && l.getPrice() <= maxPrice)
            .filter(l -> isAvailable(l, startDate, endDate))
            
            .collect(Collectors.toList());
    }

    private boolean isAvailable(Listing listing, LocalDate startDate, LocalDate endDate) {
        return listing.getAvailability().stream()
            .filter(a -> a.getDate().isAfter(startDate) || a.getDate().isEqual(startDate))
            .filter(a -> a.getDate().isBefore(endDate) || a.getDate().isEqual(endDate))
            .allMatch(a -> a.isAvailable());
    }

    // public static void main(String[] args) {




}






