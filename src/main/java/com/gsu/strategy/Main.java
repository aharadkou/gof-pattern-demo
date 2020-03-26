package com.gsu.strategy;

import com.gsu.strategy.impl.H261CompressionMethod;
import com.gsu.strategy.impl.MotionJpegCompressionMethod;
import com.gsu.strategy.impl.MpegCompressionMethod;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public final class Main {

    private static final Map<Number, CompressionMethod> MENU_MAP;

    static  {
        MENU_MAP = new HashMap<>();
        MENU_MAP.put(1, new H261CompressionMethod());
        MENU_MAP.put(2, new MotionJpegCompressionMethod());
        MENU_MAP.put(3, new MpegCompressionMethod());
    }

    public static void main(String[] args) {
        StringBuilder menu = new StringBuilder();
        menu.append("Выберите метод сжатия:").append(System.lineSeparator());
        menu.append("1. H261").append(System.lineSeparator());
        menu.append("2. Motion-JPEG").append(System.lineSeparator());
        menu.append("3. MPEG").append(System.lineSeparator());
        menu.append("0. Выход").append(System.lineSeparator());
        final Compressor compressor = new Compressor();
        try(final Scanner scan = new Scanner(System.in)) {
            while(true) {
                try {
                    System.out.println(menu);
                    int next = scan.nextInt();
                    if (next == 0) {
                        System.exit(0);
                    }
                    final CompressionMethod selectedMethod = MENU_MAP.get(next);
                    if (selectedMethod != null) {
                        compressor.setCompressionMethod(selectedMethod);
                        compressor.compress(new byte[0]);
                    } else {
                        System.out.println("Выбран неверный пункт меню!" + System.lineSeparator());
                    }
                } catch (InputMismatchException ex) {
                    scan.next();
                }
            }
        }
    }
}
