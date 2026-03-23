package apidoc.infra.api_doc.spi_adapter;


import apidoc.core.model.Document;
import apidoc.core.port.doc_spi.ManageDocumentPersistanceInterface;
import apidoc.infra.api_doc.bdd.DocumentJpaExtends;
import apidoc.infra.api_doc.entity.DocumentEntity;
import org.modelmapper.ModelMapper;
import org.springframework.orm.jpa.JpaSystemException;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;

@Component
public class ManageDocumentAdapter implements ManageDocumentPersistanceInterface {
    private final DocumentJpaExtends documentJpaExtends;
    private final ModelMapper modelMapper;

    public ManageDocumentAdapter(DocumentJpaExtends documentJpaExtends, ModelMapper modelMapper) {
        this.documentJpaExtends = documentJpaExtends;
        this.modelMapper = modelMapper;
    }

    @Override
    public Optional<Document> findDocumentByName(String name) {
        try {
            return documentJpaExtends.findById(name)
                    .map(entity -> modelMapper.map(entity, Document.class));
        } catch (JpaSystemException exception) {
            throw new JpaSystemException(exception);
        }
    }

    @Override
    public Optional<Document> createDocument(Document document) {
        Document documentResponse;
        try {
            DocumentEntity jpaDocumentResponse = documentJpaExtends.save(modelMapper.map(document, DocumentEntity.class));
            documentResponse = modelMapper.map(jpaDocumentResponse, Document.class);
        }  catch (JpaSystemException exception) {
            throw new JpaSystemException(exception);
        }
        return Optional.of(documentResponse);
    }

    @Override
    public Optional<List<Document>> findAll() {
        List<Document> documentListResponse;
        try {
            List<DocumentEntity> documentEntityListJpaResponse = documentJpaExtends.findAll();
            documentListResponse = documentEntityListJpaResponse.stream().map(documentEntity -> modelMapper.map(documentEntity, Document.class)).toList();
        } catch (JpaSystemException exception) {
            throw new JpaSystemException(exception);
        }
        return Optional.of(documentListResponse);
    }

    @Override
    public void deleteDocumentByName(String name) {
        try {
            documentJpaExtends.deleteById(name);
        }  catch (JpaSystemException exception) {
            throw new JpaSystemException(exception);
        }
    }
}
