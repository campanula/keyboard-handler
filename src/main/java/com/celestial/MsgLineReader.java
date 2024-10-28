package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class MsgLineReader extends ElementReader{

    public MsgLineReader(Scanner scanner) {
        super(scanner);
    }

    public String readFromKeyboard() {
        prompt();

        return scanner.nextLine();
    }

}