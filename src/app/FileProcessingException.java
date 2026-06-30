package app;

public class FileProcessingException extends RuntimeException {
    public FileProcessingException(String message, Throwable error) {
        super(message, error);
    }
}
