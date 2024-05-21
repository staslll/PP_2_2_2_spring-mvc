package web.servis;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.model.CarColor;
import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> getListCar(int count) {
        Car car1 = new Car("Lada", CarColor.WHITE, 300000);
        Car car2 = new Car("NIVA", CarColor.RED, 500000);
        Car car3 = new Car("MAZDA", CarColor.BLACK, 600000);
        Car car4 = new Car("Ford", CarColor.DARK, 200000);
        Car car5 = new Car("Opel", CarColor.GREEN, 400000);
        List<Car> cars = new ArrayList<Car>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        if (count >= 5 || count == 0) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}
