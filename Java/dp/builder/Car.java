package dp.builder;

public class Car {
    private String color;

    private String model;


    private Car(CarBuilder builder) {
        this.color = builder.color;
        this.model = builder.model;
    }

    @Override
    public String toString() {
        return "Model = " + model + " color = " + color;
    }

    public static class CarBuilder {
        private String color;
        private String model;

        public CarBuilder color(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

}

class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder().color("red").model("bmw").build();

        System.out.println(car);
    }
}
