package com.tavisca.workshops.jenkins.Rover;

import java.util.HashMap;

public class Vector {

    public final int x;
    public final int y;
    public final char direction;
    public Vector position;

    public Vector(int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Vector turnLeft() {
        return new Vector(this.x, this.y, leftMap.get(this.direction));
    }

    public Vector turnRight() {
        return new Vector(this.x, this.y, rightMap.get(this.direction));
    }

    public int getPositionOfX() {
        return this.x;
    }

    public int getPositionOfY() {
        return this.y;
    }

    public char getDirection() {
        return this.direction;
    }

    private static HashMap<Character, Character> leftMap = new HashMap<Character, Character>() {{
        put('N', 'W');
        put('W', 'S');
        put('S', 'E');
        put('E', 'N');
    }};

    private static HashMap<Character, Character> rightMap = new HashMap<Character, Character>() {{
        put('N', 'E');
        put('W', 'N');
        put('S', 'W');
        put('E', 'S');
    }};

    private int incrementCoordinate(int coordinateValue){
        return coordinateValue+1;
    }

    private int decrementCoordinate(int coordinateValue){
        return coordinateValue-1;
    }

    public Vector moveForward() {
        switch (this.direction){
            case 'E':
                position = new Vector(incrementCoordinate(this.x), this.y, this.direction);
                break;
            case 'W':
                position = new Vector(decrementCoordinate(this.x), this.y, this.direction);
                break;
            case 'N':
                position = new Vector(this.x, incrementCoordinate(this.y), this.direction);
                break;
            case 'S':
                position = new Vector(this.x, decrementCoordinate(this.y), this.direction);
                break;
        }
        return position;
    }
}