package tutorial1;

public class EmployeeException extends Exception {
    private static final long serialVersionUID = 1L;

    public EmployeeException() {
        super();
    }

    public EmployeeException(String message) {
        super(message);
    }
}
