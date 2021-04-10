package javacollectionmaintask;



import javacollectionmaintask.passenger.Passenger;
import javacollectionmaintask.wagon.Wagon;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Train {
    private final List<Wagon> wagons;

    public Train(List<Wagon> wagons) {
        this.wagons = wagons;
    }

    public int countPassengers() {
        return wagons.stream().mapToInt(wagon -> wagon.getPassengers().size()).sum();
    }

    public int countNumberOfBags() {
        return wagons.stream().map(Wagon::getPassengers)
                .flatMap(Collection::stream)
                .mapToInt(Passenger::getNumberOfBags)
                .sum();
    }

    public List<Wagon> sortWagonByComfort() {
        return wagons.stream().sorted(Comparator.comparing(Wagon::getComfortLevel))
                .collect(Collectors.toList());
    }

    public List<Wagon> getWagonsByRange(int from, int to) {
        return wagons.stream().filter(w -> w.getPassengers().size() > from && w.getPassengers().size() < to)
                .collect(Collectors.toList());
    }

    public List<Wagon> getWagons() {
        return wagons;
    }
}
