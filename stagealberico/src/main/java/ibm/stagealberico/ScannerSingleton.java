package ibm.stagealberico;

import java.util.Scanner;

public class ScannerSingleton {
    private static Scanner scannerInstance;

    private ScannerSingleton() {
        scannerInstance = new Scanner(System.in);
    }

    public static Scanner getInstance() {
        if (scannerInstance == null) {
            synchronized (ScannerSingleton.class) {
                if (scannerInstance == null) {
                    scannerInstance = new Scanner(System.in);
                }
            }
        }
        return scannerInstance;
    }
}