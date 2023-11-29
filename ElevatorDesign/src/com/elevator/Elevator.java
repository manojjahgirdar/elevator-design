package com.elevator;

public class Elevator {
    private int currentFloor;

    // Constructor
    public Elevator() {
        this.currentFloor = 1;
    }
    // Getter
    public int getCurrentFloor() {
        return currentFloor;
    }
    // Setter
    public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}

	private void printFloor(int floor) {
        System.out.println(floor);
        try {
            // Simulate the time it takes to move between floors
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    public void move(int targetFloor) {
        if (targetFloor >= 1 && targetFloor <= 7) {
            if (targetFloor > currentFloor) {
                // Going up
            	System.out.println("Elevator going up...");
                for (int i = currentFloor; i <= targetFloor; i++) {
                    printFloor(i);
                }
            } else if (targetFloor < currentFloor) {
                // Going down
            	System.out.println("Elevator going down...");
                for (int i = currentFloor; i >= targetFloor; i--) {
                    printFloor(i);
                }
            } else {
            	System.out.println("Elevator already on " + targetFloor + "th floor");
            }
            setCurrentFloor(targetFloor);
            System.out.println("Doors opening on " + currentFloor + "th floor");
        } else {
            System.out.println("Invalid floor. Please enter a floor between 1 and 7.");
        }
    }
}