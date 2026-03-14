package flo.api_doc.spi_adapter;

import doc_spi.ManageDocumentPersistanceInterface;
import model.Document;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@Component
public class ManageDocumentAdapter implements ManageDocumentPersistanceInterface {
    @Override
    public Optional<Document> findDocumentByName(String name) {
        return Optional.of(mockDocument);
    }

    @Override
    public Optional<Document> createDocument(Document document) {
        return Optional.of(mockDocument);
    }

    @Override
    public Optional<List<Document>> findAll() {
        return Optional.of(mockListDocument);
    }
    private Document mockDocument = new Document("fake name", "Hello world".getBytes(StandardCharsets.UTF_8));
    private List<Document> mockListDocument = Arrays.asList(mockDocument, mockDocument);
}
