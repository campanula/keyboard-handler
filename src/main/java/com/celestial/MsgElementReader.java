package com.celestial;

import java.util.Scanner;

public class MsgElementReader extends ElementReader {

    public MsgElementReader(Scanner scanner) {
        super(scanner);
    }

    public String readFromKeyboard() {
        prompt();

        return scanner.next();
    }
}