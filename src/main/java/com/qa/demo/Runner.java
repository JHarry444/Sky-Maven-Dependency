package com.qa.demo;

import com.qa.demo.testing.DoggoCompetition;
import com.qa.demo.testing.InvalidInputException;

import java.util.List;
import java.util.Scanner;

public class Runner {

    // USER
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in);) {
            List<String> placements = null;
            do {
                System.out.println("Enter a place from 1 -> 100:");
                System.out.println((new int[0])[1]); // comment out to fix error
                try {
                    placements = DoggoCompetition.placements(scan.nextInt());
                } catch (InvalidInputException iie) {
                    System.out.println(iie.getMessage());
                }
            } while (placements == null);
            System.out.println(placements);
        }
    }
}
