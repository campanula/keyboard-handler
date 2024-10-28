package com.celestial;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Keyboard Handler
 *
 */
public class App
{
    public static void main( String[] args )
    {
        String lineRead;
        Scanner sc = new Scanner(System.in);
        int lineNo = 0;
        ArrayList<LineEntry> lines = new ArrayList<>(10);
        MsgLineReader messageLineReader = new MsgLineReader(sc);

        try
        {
            while( (lineRead = messageLineReader.readFromKeyboard(sc)) != null )
            {
                if(lineRead.equalsIgnoreCase("QUIT"))
                    break;
                LineEntry le = new LineEntry(++lineNo, lineRead);
                lines.add(le);
            }
        }catch( NoSuchElementException e )
        {
            System.out.println(e);
        }

        lines.forEach(line ->
        {
            System.out.println(line);
        });
    }
}