class TablePrinter {
    public synchronized void printTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
            try { Thread.sleep(50); } catch (InterruptedException e) {}
        }
    }
}

class TableThread extends Thread {
    TablePrinter printer;

    TableThread(TablePrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printTable(5);
    }
}

public class Main {
    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();
        new TableThread(printer).start();
        new TableThread(printer).start();
    }
}
