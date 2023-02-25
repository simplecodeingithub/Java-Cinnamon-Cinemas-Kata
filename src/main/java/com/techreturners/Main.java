package com.techreturners;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to Cinnamon Cinemas!");
        MovieTheatre movieTheatre=new MovieTheatre();
        while (true){
            System.out.println("Enter the number of seats you want to book(1-3):");
            int numSeats=scanner.nextInt();
            if(numSeats<1 || numSeats>3){
                System.out.println("Invalid input.Please try again.");
                continue;
            }
            SeatAllocationResult result=movieTheatre.allocateSeats(numSeats);
            if(result.isSuccessful()){
                System.out.println("Seats allocated Successfully:" + result.getSeats());
                System.out.println("Remaining Seats:" + movieTheatre.getTotalSeats());
            }
            else {
                System.out.println("Sorry, there are not enough seats available.Please try again.");
                System.out.println("Remaining Seats:" + movieTheatre.getTotalSeats());
            }
            if(movieTheatre.getTotalSeats()==0){
                System.out.println("All seats have been allocated.Exiting Program ");
                break;
            }
        }
    }
}