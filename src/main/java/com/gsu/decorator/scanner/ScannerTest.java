package com.gsu.decorator.scanner;

import java.io.InputStream;
import java.util.Scanner;

public final class ScannerTest {
    public static void main(String[] args) {
        try (final Scanner scanner = new Scanner(getTestInputStream())) {
            testOneSpaceScanner(scanner);
        }
        try (final Scanner scanner = new Scanner(getTestInputStream())) {
            testUpperCaseScanner(scanner);
        }
        try (final Scanner scanner = new Scanner(System.in)) {
            testOneSpaceScanner(scanner);
            testUpperCaseScanner(scanner);
        }
    }

    private static void testOneSpaceScanner(final Scanner scanner) {
        OneSpaceScanner oneSpaceScanner = new OneSpaceScanner(scanner);
        System.out.println("One space scanner:");
        System.out.println(oneSpaceScanner.nextLine());
    }

    private static void testUpperCaseScanner(final Scanner scanner) {
        UpperCaseScanner upperCaseScanner = new UpperCaseScanner(scanner);
        System.out.println("Upper case scanner:");
        System.out.println(upperCaseScanner.nextLine());
    }

    private static InputStream getTestInputStream() {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        return classloader.getResourceAsStream("test.txt");
    }
}
