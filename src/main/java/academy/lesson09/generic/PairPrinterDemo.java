package academy.lesson09.generic;

public class PairPrinterDemo {
    public static void main(String[] args) {
        PairPrinterImpl<Integer, String> pairPrinter = new PairPrinterImpl<>();
        pairPrinter.print(1, "zero");

    }
}
