package gq.cader.realfakestoreserver.exception;

public class CheckoutFailedException extends RuntimeException{
    public CheckoutFailedException() {
    }

    public CheckoutFailedException(String message) {
        super(message);
    }

    public CheckoutFailedException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckoutFailedException(Throwable cause) {
        super(cause);
    }

    public CheckoutFailedException(String message, Throwable cause,
                                   boolean enableSuppression,
                                   boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
