# Cinnamon Cinemas Seat Allocation Program

    This program is designed to allocate seats to customers who purchase tickets for a movie at Cinnamon Cinemas.
    This program follows the business requirements outlined below:
    
   ## Business Requirements:
    
     * The Cinnamon Cinemas Movie Theatre has 15 Seats,arranged in 3 rows of 5.
     * Rows are assigned a letter from A to C.
     * Seats are arranged a number 1 to 5.
     * A Customer can request a number of seats between 1 to 3 for a movie.
     * The Customer should be allocate the required number of seats from the available seats on the seating plan.
     * The seats should be recorded as allocated.
     * All of the seats are available for sale when the program starts.
     * The program should continue to allocate a random number of seats until it finds there are not enough seats left to complete the request.
     * Once there are not enough seats available to be allocated then the program can halt.
     
     ## Assumptions:
     
     * The program will be implemented as a console application.
     * The program will be written in Java.
     * The program will display a message to the user when there are not enough seats left to complete a request.
     
   ## Getting Started with Usage:
     
      * When prompted, enter the number of seats you would like to purchase for the movie (between 1 and 3).
      * The program will allocate the required number of seats from the available seats starting from seat A1 and filling the auditorium from left to right, front to back.
      * If there are not enough seats left to complete the request, the program will display a message indicating that there are not enough seats available.
       
   ## Testing:
     
      * This program uses JUnit 5 for Test-Driven Development(TDD) to test the solution and implemented with Parameterized test which takes input from CSV file.
