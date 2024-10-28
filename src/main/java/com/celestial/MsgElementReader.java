package com.celestial;

import java.util.Scanner;

public class MsgElementReader {
    private final Scanner scanner;

    public MsgElementReader(Scanner scanner) {
        this.scanner = scanner;
    }

    String readFromKeyboad() {
        String lineRead;

        prompt();
        
        if ((lineRead = scanner.nextLine()) != null) {
            return lineRead;
        }
        return null;
    }

    static private boolean prompt()
    {
        System.out.print("Enter a message: ");
        return true;
    }
}