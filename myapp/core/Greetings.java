package myapp.core;

import java.io.Console;

public class Greetings {
    
    // write entry point
    public static void main(String[] args) {
        // Get the console
        Console cons = System.console();

        // Read from input
        String name = cons.readLine("what is your name? ");

        if (name.length() > 0) {
            System.out.printf("Hello %s, nice to meet you.\n", name);
            
        }

        else {
            System.err.println("You have not told me your name");
        }


    };
};

