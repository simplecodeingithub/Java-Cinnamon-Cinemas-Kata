package com.techreturners;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MovieTheatre {
    private final int numRows=3;
    private final int numCols=5;
    private final int totalSeats=numRows * numCols;
    public final List<Seat> availableSeats;

    public MovieTheatre() {
        availableSeats = new ArrayList<>();
        for(int row=0;row<numRows;row++){
            for(int col=0;col<numCols;col++){
                availableSeats.add(new Seat(row,col));
            }
        }
    }
    public int getTotalSeats(){
        return availableSeats.size();
       // return totalSeats;
    }
    public SeatAllocationResult allocateSeats(int numSeats){
        if(numSeats<1 || numSeats>3){
            throw new IllegalArgumentException("Number of seats must be between 1 and 3 ");
        }
        if(availableSeats.size()<numSeats){
            return SeatAllocationResult.failure();
        }
        List<Seat>allocatedSeats =new ArrayList<>();
        for(int i=0;i<numSeats;i++){
            Seat seat=availableSeats.remove(0);
            seat.setAllocated(true);
            allocatedSeats.add(seat);
        }
        return SeatAllocationResult.success(allocatedSeats);
    }
}
