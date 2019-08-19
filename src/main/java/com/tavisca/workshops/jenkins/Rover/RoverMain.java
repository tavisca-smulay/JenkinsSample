package com.tavisca.workshops.jenkins.Rover;

public class RoverMain {
    public static Vector controlRover(Vector vector, String key){
        switch (key){
            case "m": case "M": vector = vector.moveForward();
                break;
            case "l": case "L": vector = vector.turnLeft();
                break;
            case "r": case "R": vector = vector.turnRight();
                break;
            case "d": case "D":
                System.out.println("(x, y) ->   ("+vector.getPositionOfX()+", "+vector.getPositionOfY()+")");
                System.out.println("direction -> "+vector.getDirection());
                break;
            default: break;
        }
        return vector;
    }
    public static void main(String[] args) {
        System.out.println("Hey There! Welcome to Mars Rover.");
        Vector vector = new Vector(0, 0, 'E');
        System.out.println("Current Position of Rover is: ");
        controlRover(vector, "d");
        System.out.println();
        System.out.println("Good Bye! Have a Nice Day! :)");
    }
}