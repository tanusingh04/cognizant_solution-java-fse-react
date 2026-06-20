package FactoryMethodPatternExample;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document (.pdf) in Reader...");
    }

    @Override
    public void save() {
        System.out.println("Saving PDF Document (compiled structures)...");
    }

    @Override
    public void close() {
        System.out.println("Closing PDF Document.");
    }
}
