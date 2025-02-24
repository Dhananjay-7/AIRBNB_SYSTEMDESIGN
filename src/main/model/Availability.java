package main.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Availability {
    private Map<LocalDate, Boolean> availability= new HashMap<>();

    private boolean isAvailable(LocalDate date){
        return availability.getOrDefault(date, true);
    }

    private void updaetAvailability(LocalDate date, boolean isAvailable){
        availability.put(date, isAvailable);
    }
    






}
