package FactoryMethodPatternExample;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing Factory Method Pattern ===");

        // 1. Create a Word Document Factory and process a document
        System.out.println("\n--- Creating Word Document ---");
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.save();
        wordDoc.close();

        // 2. Create a PDF Document Factory and process a document
        System.out.println("\n--- Creating PDF Document ---");
        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.save();
        pdfDoc.close();

        // 3. Create an Excel Document Factory and process a document
        System.out.println("\n--- Creating Excel Document ---");
        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.save();
        excelDoc.close();
    }
}
