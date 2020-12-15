package web.controller;

import Model.Car;
import Service.CarServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value="count", defaultValue = "5") Integer count,
                           ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("model1", "blue", 1));
        cars.add(new Car("model2", "black", 2));
        cars.add(new Car("model3", "white", 3));
        cars.add(new Car("model4", "orange", 4));
        cars.add(new Car("model5", "green", 5));
        CarServiceImp carService = new CarServiceImp();
        cars = carService.getCars(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
