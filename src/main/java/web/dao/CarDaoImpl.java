package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    private final List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(1L, "one", 1));
        cars.add(new Car(2L, "two", 2));
        cars.add(new Car(3L, "three", 3));
        cars.add(new Car(4L, "four", 4));
        cars.add(new Car(5L, "five", 5));
    }

    @Override
    public List<Car> getListCars(int count) {
        return cars.stream().limit(count).toList();
    }
}
