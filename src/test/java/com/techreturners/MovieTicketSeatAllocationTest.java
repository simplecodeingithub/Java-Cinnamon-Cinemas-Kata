package com.techreturners;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MovieTicketSeatAllocationTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/testcases.csv", numLinesToSkip = 1)
    void testAllocatedSeats(int numSeats, int expectedNumSeatsAllocated) {
        MovieTheatre movieTheatre = new MovieTheatre();

        if (numSeats < 1 || numSeats > 3) {
            assertThrows(IllegalArgumentException.class, () -> {
                movieTheatre.allocateSeats(numSeats);
            });
            return;
        }
        SeatAllocationResult result = movieTheatre.allocateSeats(numSeats);

        if (expectedNumSeatsAllocated == 0) {
            assertFalse(result.isSuccessful());
        } else {
            assertTrue(result.isSuccessful());
            List<Seat> allocatedSeats = result.getSeats();
            assertEquals(expectedNumSeatsAllocated, allocatedSeats.size());
            for (Seat seat : allocatedSeats) {
                assertTrue(seat.isAllocated());
            }
        }

    }
}


