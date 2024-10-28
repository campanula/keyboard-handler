package com.celestial;

import java.io.InputStream;
import java.util.Scanner;

public class ElementReader {

     Scanner scanner;

    public ElementReader(Scanner scanner) {
        this.scanner = scanner;
    }

    static boolean prompt()
    {
        System.out.print("Enter a message: ");
        return true;
    }

    public String readFromKeyboard(InputStream inputStream){
        return "";
    }
}
