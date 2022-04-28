package zw.co.econet.assessment.common;

public class BusinessRuntimeException extends RuntimeException {

    public BusinessRuntimeException(String message) {
        super(message);
    }

    public BusinessRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessRuntimeException(final Throwable cause) {
        super(cause);
    }
}
