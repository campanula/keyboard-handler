package com.celestial;

import java.util.Scanner;

public class MsgElementReader {
    private final Scanner scanner;

    public MsgElementReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readFromKeyboad() {
        prompt();

        return scanner.nextLine();
    }

    static private boolean prompt()
    {
        System.out.print("Enter a message: ");
        return true;
    }
}