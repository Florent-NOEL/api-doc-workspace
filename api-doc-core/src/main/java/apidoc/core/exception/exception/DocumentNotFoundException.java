package apidoc.core.exception.exception;


public class DocumentNotFoundException extends RuntimeException {

    private final String name;

    public DocumentNotFoundException(String name) {
        super("Document not found with name: " + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
