package apidoc.infra.api_doc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "document")
public class DocumentEntity {
    @Id
    private String name;
    private byte[] txt;

    public DocumentEntity(String name, byte[] txt) {
        this.name = name;
        this.txt = txt;
    }

    public DocumentEntity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getTxt() {
        return txt;
    }

    public void setTxt(byte[] txt) {
        this.txt = txt;
    }
}
