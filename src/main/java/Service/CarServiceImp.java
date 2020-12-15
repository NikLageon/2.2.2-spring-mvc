package Service;

import Model.Car;

import java.util.List;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCars(List<Car> cars, int numberCars) {
        if (numberCars < 0) {
            cars.clear();
            return cars;
        }
        if (numberCars > cars.size()) {
            return cars;
        }
        return cars.subList(0, numberCars);
    }
}
