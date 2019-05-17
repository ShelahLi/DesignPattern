package exceptions;

public class UnSupportedShapeException extends Exception {
    public UnSupportedShapeException(String message){super(message);}
    public UnSupportedShapeException(String message, Throwable cause){super(message, cause);}

}
