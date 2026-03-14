package apidoc.infra.api_doc.conf;


import apidoc.core.controller.ManageDocumentImplement;
import apidoc.infra.api_doc.spi_adapter.ManageDocumentAdapter;
import apidoc.core.port.doc_api.ManageDocumentInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    ManageDocumentInterface manageDocumentInterface(ManageDocumentAdapter repo){
        return new ManageDocumentImplement(repo);
    }
}
