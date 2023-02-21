package com.techreturners;

public class Seat {
    private final int row;
    private final int col;
    private boolean isAllocated;

    public Seat(int row, int col) {
        this.row = row;
        this.col = col;
        this.isAllocated=false;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public boolean isAllocated() {
        return isAllocated;
    }

    public void setAllocated(boolean allocated) {
        isAllocated = allocated;
    }
    @Override
    public String toString(){
        char rowChar=(char)('A'+row);
        return rowChar+ Integer.toString(col+1);
    }
}
