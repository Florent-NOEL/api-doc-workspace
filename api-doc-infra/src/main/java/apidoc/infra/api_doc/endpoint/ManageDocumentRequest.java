package apidoc.infra.api_doc.endpoint;


import apidoc.core.model.Document;
import apidoc.core.port.doc_api.ManageDocumentInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class ManageDocumentRequest {
    private final ManageDocumentInterface manageDocumentInterface;

    public ManageDocumentRequest(ManageDocumentInterface manageDocumentInterface) {
        this.manageDocumentInterface = manageDocumentInterface;
    }
    @GetMapping("/find/{name}")
    public ResponseEntity<Document> findDocumentByName(@PathVariable String name) {
        Document documentResponse = manageDocumentInterface.findDocumentByName(name);
        return ResponseEntity.status(200).body(documentResponse);
    }
    @PostMapping("/create")
    public ResponseEntity<Document> createDocument(@RequestBody Document document) {
        Document documentResponse = manageDocumentInterface.createDocument(document);
        return ResponseEntity.status(201).body(documentResponse);
    }
    @GetMapping("/find_all")
    public ResponseEntity<List<Document>> findAll() {
        List<Document> documentListResponse = manageDocumentInterface.findAll();
        return ResponseEntity.status(200).body(documentListResponse);
    }
}
