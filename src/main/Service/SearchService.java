package main.Service;

import java.util.List;

public interface SearchService {
    List<String> searchListings(String city, String state, String country);
}
