package rest.network.exceptions;

public class LogicException extends RuntimeException  {
    private static final String DEFAULT_MESSAGE = "Произошла непредвиденная ошибка";

    public LogicException(String message) {
        super(message);
    }

    public LogicException() {
        super(DEFAULT_MESSAGE);
    }
}
