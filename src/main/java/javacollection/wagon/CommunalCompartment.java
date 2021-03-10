package javacollection.wagon;


import javacollection.ComfortLevel;
import javacollection.passenger.Passenger;

public class CommunalCompartment extends Wagon {
    public CommunalCompartment(int maxCapacity) {
        super(maxCapacity);
        setComfortLevel(ComfortLevel.COMFORT);
    }

    @Override
    public void boardPassenger(Passenger passenger) {
        System.out.println("проходите!");
        getPassengers().add(passenger);
    }
}
