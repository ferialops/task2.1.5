package ru.vsu.cs.kunakhova_a_y;

import java.util.Scanner;

public class Main {
    public static Dots dotA;
    public static Dots dotB;
    public static Dots dotC;
    public static Dots point;

    public static void main(String[] args) {

        dotA = currentDot();
        dotB = currentDot();
        dotC = currentDot();
        Triangle triangle = new Triangle(dotA, dotB, dotC);
        point = currentDot();
        if(triangle.ifDotInTriangle(point)) {
            System.out.println("Dot is in triangle");
        } else {
            System.out.println("Dot isn't in triangle");
        }
        System.out.println("Perimeter = " + triangle.CalculatePerimeter());
        System.out.println("Area = " + triangle.CalculateArea());

    }

    public static Dots currentDot() {
        double x = writeCoordinates("Write x ");
        double y = writeCoordinates("Write y ");
        return new Dots(x, y);
    }

    public static double writeCoordinates(String text) {
        System.out.print(text);
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
