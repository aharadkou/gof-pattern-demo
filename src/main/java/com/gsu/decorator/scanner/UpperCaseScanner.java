package com.gsu.decorator.scanner;

import java.util.Scanner;

public class UpperCaseScanner {

    private Scanner scanner;
    public UpperCaseScanner(final Scanner scanner) {
        this.scanner = scanner;
    }

    public String nextLine() {
        return scanner.nextLine().toUpperCase();
    }
}
