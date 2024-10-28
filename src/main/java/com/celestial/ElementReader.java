package com.celestial;

import java.util.Scanner;

public class ElementReader {

     final Scanner scanner;

    public ElementReader(Scanner scanner) {
        this.scanner = scanner;
    }

    static boolean prompt()
    {
        System.out.print("Enter a message: ");
        return true;
    }

    public String readFromKeyboard(Scanner scanner){
        prompt();
        return "";
    }
}
