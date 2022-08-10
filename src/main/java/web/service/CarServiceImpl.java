package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("VAZ", 2121, "Чёрный"));
        cars.add(new Car("Volvo", 60, "White"));
        cars.add(new Car("BMW", 750, "Green"));
        cars.add(new Car("Toyota", 300, "Blue"));
        cars.add(new Car("Nissan", 350, "Yellow"));
        cars.add(new Car("Honda", 1000, "Brown"));
    }

    public CarServiceImpl(){

    }

    @Override
    public List<Car> getCounter(int count)  {
        List<Car> newListCar = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            newListCar.add(cars.get(i));
        }
        return newListCar;
    }



}
