package customExceptions;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public IllegalTriangleException(String msg,
                                    Throwable cause) {
        super(msg, cause);
    }
}
