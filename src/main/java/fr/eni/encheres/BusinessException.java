package fr.eni.encheres;

public class BusinessException extends Exception {
    private static final long serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException() {
        super();
    }

    @Override
    public String getMessage() {
        return "BusinessException : " + super.getMessage();
    }
}
