package FactoryMethodPatternExample;

public abstract class DocumentFactory {
    // Factory Method
    public abstract Document createDocument();

    // Optional helper method that subclasses can inherit
    public void processDocument() {
        Document doc = createDocument();
        doc.open();
        doc.save();
        doc.close();
    }
}
