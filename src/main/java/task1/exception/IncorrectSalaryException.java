package task1.exception;

public class IncorrectSalaryException extends Exception{

    public IncorrectSalaryException() {
    }

    public IncorrectSalaryException(String message) {
        super(message);
    }
}
