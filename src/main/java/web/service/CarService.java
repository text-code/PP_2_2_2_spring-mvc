package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarService {
    public static List<Car> getListCars(List<Car> cars, int count) {
        return cars.stream().limit(count).toList();
    }
}
