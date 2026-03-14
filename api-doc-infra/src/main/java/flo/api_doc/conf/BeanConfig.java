package flo.api_doc.conf;

import controller.ManageDocumentImplement;
import doc_api.ManageDocumentInterface;
import doc_spi.ManageDocumentPersistanceInterface;
import flo.api_doc.spi_adapter.ManageDocumentAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    ManageDocumentInterface manageDocumentInterface(ManageDocumentAdapter repo){
        return new ManageDocumentImplement(repo);
    }
}
