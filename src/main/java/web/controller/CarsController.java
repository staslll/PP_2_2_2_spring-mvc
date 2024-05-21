package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.CarService;

import java.util.Optional;

@Controller
public class CarsController {
    private CarService carService;
   @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String showCars(@RequestParam(value = "count") Optional<Integer> count, Model model) {
        model.addAttribute("cars", carService.getListCar(count.orElse(0)));

        return "cars";
    }


}
