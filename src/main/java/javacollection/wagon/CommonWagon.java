package javacollection.wagon;


import javacollection.ComfortLevel;
import javacollection.passenger.Passenger;

public class CommonWagon extends Wagon {
    public CommonWagon(int maxCapacity) {
        super(maxCapacity);
        setComfortLevel(ComfortLevel.ECONOMY);
    }

    @Override
    public void boardPassenger(Passenger passenger) {
        System.out.println("заходи, пёс!");
        getPassengers().add(passenger);
    }

}
