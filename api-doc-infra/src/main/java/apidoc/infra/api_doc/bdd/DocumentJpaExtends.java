package apidoc.infra.api_doc.bdd;

import apidoc.infra.api_doc.entity.DocumentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentJpaExtends extends JpaRepository<DocumentEntity, String> {
}
