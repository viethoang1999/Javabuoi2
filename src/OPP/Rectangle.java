package OPP;

import java.util.Scanner;

public class Rectangle {
    private int weight;
    private int height;


    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getChuvi() {
        return (weight + height) * 2;
    }

    public double getDientich() {
        return weight * height;
    }

    public boolean Check() {
        if (weight == height) {
            return (true);
        } else {
            return (false);
        }
    }

}
