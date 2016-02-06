package HW_5;

import java.util.Arrays;

public class AutoFormatException extends Exception {

    private String[] errors;

    public AutoFormatException() {
        super("Auto Format Exception");
    }

    public AutoFormatException(String message) {
        super(message);
    }

    public AutoFormatException(String[] errors) {
        super("Auto Format Exception");
        this.errors = errors;
    }

    public String toString() {
        return "Wrong format: " + Arrays.toString(errors);
    }
}
