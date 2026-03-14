package controller;

import doc_api.ManageDocumentInterface;
import doc_spi.ManageDocumentPersistanceInterface;
import exception.DocumentNotFoundException;
import model.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ManageDocumentImplement implements ManageDocumentInterface {
    private final ManageDocumentPersistanceInterface persistanceInterface;

    public ManageDocumentImplement(ManageDocumentPersistanceInterface persistanceInterface) {
        this.persistanceInterface = persistanceInterface;
    }

    @Override
    public Document findDocumentByName(String name) {
     return persistanceInterface.findDocumentByName(name).orElseThrow(() -> new DocumentNotFoundException(name));
    }

    @Override
    public Document createDocument(Document document) {
        return persistanceInterface.createDocument(document).orElseThrow(() -> new DocumentNotFoundException(document.getName()));
    }

    @Override
    public List<Document> findAll() {
        return persistanceInterface.findAll().orElse(new ArrayList<>());
    }
}
