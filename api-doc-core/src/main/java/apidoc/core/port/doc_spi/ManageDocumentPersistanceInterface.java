package apidoc.core.port.doc_spi;

import apidoc.core.model.Document;

import java.util.List;
import java.util.Optional;

public interface ManageDocumentPersistanceInterface {
    Optional<Document> findDocumentByName(String name);
    Optional<Document> createDocument(Document document);
    Optional<List<Document>> findAll();
}