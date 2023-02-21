package com.techreturners;

import java.util.List;

public class SeatAllocationResult {
    private final boolean succesful;
    private final List<Seat> seats;

    public SeatAllocationResult(boolean succesful, List<Seat> seats) {
        this.succesful = succesful;
        this.seats = seats;
    }
    public static SeatAllocationResult success(List<Seat>seats){
        return new SeatAllocationResult(true,seats);
    }
    public static SeatAllocationResult failure(){
        return new SeatAllocationResult(false,null);
    }
    public boolean isSuccesful(){
        return succesful;
    }
    public List<Seat>getSeats(){
        return seats;
    }
}
