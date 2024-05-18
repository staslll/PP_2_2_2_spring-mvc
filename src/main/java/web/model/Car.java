package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private CarColor color;
    private double prais;

    public Car(String model, CarColor color, double prais) {
        this.model = model;
        this.color = color;
        this.prais = prais;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public double getPrais() {
        return prais;
    }

    public void setPrais(double prais) {
        this.prais = prais;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(prais, car.prais) == 0 && Objects.equals(model, car.model) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, prais);
    }

    @Override
    public String toString() {
        return "Car{" +
                "collor=" + color +
                ", model='" + model + '\'' +
                ", prais=" + prais +
                '}';
    }
}
