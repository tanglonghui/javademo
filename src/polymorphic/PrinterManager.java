package polymorphic;

public class PrinterManager {
    public static void main(String[] args) {
        Printer printer=new CSPrinter();
        printer(printer);
        printer(new HBPrinter());
    }

    static void printer(Printer printer) {
        printer.printer();
    }
}
