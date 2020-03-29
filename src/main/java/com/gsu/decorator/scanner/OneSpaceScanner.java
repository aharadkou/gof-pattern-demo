package com.gsu.decorator.scanner;

import java.util.Scanner;

public class OneSpaceScanner {

    private Scanner scanner;

    public OneSpaceScanner(final Scanner scanner) {
        this.scanner = scanner;
    }

    public String nextLine() {
        return scanner.nextLine().trim().replaceAll("\\s+", " ");
    }
}
