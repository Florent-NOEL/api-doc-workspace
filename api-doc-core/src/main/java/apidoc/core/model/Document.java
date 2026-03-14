package apidoc.core.model;

public class Document {
    private String name;
    private byte[] txt;

    public Document(String name, byte[] txt) {
        this.name = name;
        this.txt = txt;
    }

    public Document() {
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
