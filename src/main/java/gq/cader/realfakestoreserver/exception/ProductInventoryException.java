package gq.cader.realfakestoreserver.exception;

public class ProductInventoryException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ProductInventoryException() {
    }

    public ProductInventoryException(String message) {
        super(message);
    }

    public ProductInventoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProductInventoryException(Throwable cause) {
        super(cause);
    }

    public ProductInventoryException(
            String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {

        super(message, cause, enableSuppression, writableStackTrace);
    }
}
