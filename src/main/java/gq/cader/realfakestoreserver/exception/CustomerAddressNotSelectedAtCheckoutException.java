package gq.cader.realfakestoreserver.exception;

public class CustomerAddressNotSelectedAtCheckoutException
    extends AddressException{

    public CustomerAddressNotSelectedAtCheckoutException() {
    }

    public CustomerAddressNotSelectedAtCheckoutException(String message) {
        super(message);
    }

    public CustomerAddressNotSelectedAtCheckoutException(String message,
                                                         Throwable cause) {
        super(message, cause);
    }

    public CustomerAddressNotSelectedAtCheckoutException(Throwable cause) {
        super(cause);
    }

    public CustomerAddressNotSelectedAtCheckoutException(
        String message,
        Throwable cause,
        boolean enableSuppression, boolean writableStackTrace) {

        super(message, cause, enableSuppression, writableStackTrace);
    }
}
