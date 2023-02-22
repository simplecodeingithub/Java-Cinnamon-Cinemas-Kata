package com.techreturners;

import java.util.List;

public class SeatAllocationResult {
    private final boolean successful;
    private final List<Seat> seats;

    public SeatAllocationResult(boolean successful, List<Seat> seats) {
        this.successful = successful;
        this.seats = seats;
    }
    public static SeatAllocationResult success(List<Seat>seats){
        return new SeatAllocationResult(true,seats);
    }
    public static SeatAllocationResult failure(){
        return new SeatAllocationResult(false,null);
    }
    public boolean isSuccessful(){
        return successful;
    }
    public List<Seat>getSeats(){
        return seats;
    }
}
