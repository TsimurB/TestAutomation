package javacollectionmaintask.passenger;

public class Passenger {

    public Passenger(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    private final int numberOfBags;

    public int getNumberOfBags() {
        return numberOfBags;
    }
}
