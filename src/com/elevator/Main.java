package com.elevator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
        Elevator[] elevators = new Elevator[3];

        // Create 3 elevators
        for (int i = 0; i < elevators.length; i++) {
            elevators[i] = new Elevator();
        }

        while (true) {
            System.out.print("Enter elevator number (1-3) or enter -1 to exit: ");
            int elevatorNumber = scanner.nextInt();

            if (elevatorNumber == -1) {
                System.out.println("Exiting elevator simulation.");
                break;
            }

            if (elevatorNumber >= 1 && elevatorNumber <= 3) {
                System.out.print("Enter floor number (1-7): ");
                int floorNumber = scanner.nextInt();

                elevators[elevatorNumber - 1].move(floorNumber);
            } else {
                System.out.println("Invalid elevator number. Please enter a number between 1 and 3.");
            }
        }

        scanner.close();
    }
}
