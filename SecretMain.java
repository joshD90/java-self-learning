/**
 * Main.java
 * Entry Point to Entire Program;
 * 
 * Created by: Joshua Dancey - January 25, 2024
 * Copyright (c) 2024 by Joshua Dancey Inc.
 * All Rights Reserved.
 * 
 */
import java.util.Scanner;

public class SecretMain {
    public static void main(String[] args){
        AutoPrint printer = new AutoPrint();
          
        //automated diamond (fairly hacky)
        Scanner scanner = new Scanner(System.in);
        try {
            printer.printDiamondAuto(63);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        MyFirstProgram.Main(args);

        System.out.println("Press Enter key to exit...");
        scanner.nextLine();
        scanner.close();

    }
}