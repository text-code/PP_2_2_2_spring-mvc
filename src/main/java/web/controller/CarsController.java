package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

import static web.service.CarService.getListCars;

@Controller
public class CarsController {

    @GetMapping("/cars")
    public String getCars(
            @RequestParam(value = "count", defaultValue = "5") int count,
            ModelMap model
    ) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1L, "one", 1));
        cars.add(new Car(2L, "two", 2));
        cars.add(new Car(3L, "three", 3));
        cars.add(new Car(4L, "four", 4));
        cars.add(new Car(5L, "five", 5));

        model.addAttribute("cars", getListCars(cars, count));

        return "cars";
    }
}
