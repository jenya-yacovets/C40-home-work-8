public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 210, 95000);

        try {
            car.start();
        } catch (CarException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("Произошла не известная ошибка");
        }

        
        Car car2 = new Car("Tesla", 190, 85000);

        try {
            car2.start();
        } catch (CarException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println("Произошла не известная ошибка");
        }
    }
}
