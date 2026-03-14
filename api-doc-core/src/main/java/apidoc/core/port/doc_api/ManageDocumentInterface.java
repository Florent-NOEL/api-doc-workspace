package apidoc.core.port.doc_api;
import apidoc.core.model.Document;

import java.util.List;

public interface ManageDocumentInterface {
    Document findDocumentByName(String name);
    Document createDocument(Document document);
    List<Document> findAll();
}