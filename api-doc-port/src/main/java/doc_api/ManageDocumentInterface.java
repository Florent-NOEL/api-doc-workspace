package doc_api;
import model.Document;

import java.util.List;

public interface ManageDocumentInterface {
    Document findDocumentByName(String name);
    Document createDocument(Document document);
    List<Document> findAll();
}