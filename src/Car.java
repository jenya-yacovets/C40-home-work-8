import java.util.Random;

public class Car {
    private String brand;
    private int speed;
    private int price;

    Random random = new Random();

    public Car(String brand, int speed, int price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void start() throws CarException {
        int number = random.nextInt(21);

        if (number % 2 == 0) {
            throw new CarException("Ошибка! \nЧисло четное, не заводим");
        } else {
            System.out.println("Автомобиль марки " + this.brand + " успешно завелся.");
        }

    }
}
