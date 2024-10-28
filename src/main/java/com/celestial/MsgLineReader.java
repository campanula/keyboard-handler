package com.celestial;

import java.util.Scanner;

public class MsgLineReader {
    private final Scanner scanner;

    public MsgLineReader(Scanner scanner) {
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