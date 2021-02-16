public class CarException extends Exception{
    private String message;

    public CarException(String message) {
        this.message = message;
    }

    public CarException() {
    }

    @Override
    public String getMessage() {
        return message;
    }
}
