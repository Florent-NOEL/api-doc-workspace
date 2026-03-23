package apidoc.core.controller;

import apidoc.core.port.doc_api.ManageDocumentInterface;
import apidoc.core.port.doc_spi.ManageDocumentPersistanceInterface;
import apidoc.core.exception.exception.DocumentNotFoundException;
import apidoc.core.model.Document;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public void deletDocumentByName(String name) {
        persistanceInterface.deleteDocumentByName(name);
    }
}
