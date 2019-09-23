package gq.cader.realfakestoreserver.exception;

public class CustomerAddressMissingAtCheckoutException
        extends RuntimeException {

    public CustomerAddressMissingAtCheckoutException() {
    }

    public CustomerAddressMissingAtCheckoutException(String message) {
        super(message);
    }

    public CustomerAddressMissingAtCheckoutException(
            String message, Throwable cause) {
        super(message, cause);
    }

    public CustomerAddressMissingAtCheckoutException(Throwable cause) {
        super(cause);
    }

    public CustomerAddressMissingAtCheckoutException(
            String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {

        super(message, cause, enableSuppression, writableStackTrace);
    }
}
