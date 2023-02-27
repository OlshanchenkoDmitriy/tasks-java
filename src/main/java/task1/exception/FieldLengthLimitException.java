package task1.exception;

public class FieldLengthLimitException extends Exception {

    public FieldLengthLimitException() {
    }

    public FieldLengthLimitException(String message) {
        super(message);
    }
}
