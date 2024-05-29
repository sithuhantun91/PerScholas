package com.perscholas.java_basics;

public class JavaInterface {
}

abstract class Shape3 {
    protected String color;
    protected double height; // To hold height.
    protected double width; //To hold width
    protected double base; //To hold base
    public void setColor(String color) {
        this.color = color;}
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setBase(double base) {
        this.base = base;
    }
    // The getArea method is abstract.
    // It must be overridden in a subclass.
    /** All shapes must provide a method called getArea() */
    public abstract double getArea();
    /** Returns a self-descriptive string */
    public String toString() {
        return "Shape[color=" + color + "]";
    }
    public void displayshapName()
    {
        System.out.println("I am a Shape.");
    }
}

interface Movable {
    // An interface defines a list of public abstract methods to be implemented by the subclasses
    void moveUp(); // "public" and "abstract" by default
    void moveDown();
    void moveLeft();void moveRight();
    String getCoordinate();
}

class Circle3 extends Shape3 implements Movable {
    protected double radius;
    private int x, y; // x and y coordinates of the point
    private final double PI = Math.PI;
    /** Constructs a MovablePoint instance at the given x and y */
    public Circle3(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle3(double radius) {
        this.radius = radius;
    }
    public Circle3(double radius, double height) {
        this.radius = radius;super.height = height;
    }
    @Override
    public double getArea() {
        //double area = PI * this.radius * this.radius;
        // initializing value in parent class variable
        double area = PI * Math.pow(this.radius, 2);
        return area; //reference to parent class variable
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() + "] ";
    }
    public String getCoordinate()
    {
        return "(" + x + "," + y + ")";
    }
    //Need to implement all the abstract methods defined in the interface Movable
    @Override
    public void moveUp() {
        y++;
    }
    @Override
    public void moveDown() {
        y--;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}

class myRunner3 {
    public static void main(String[] args) {
        Circle3 c1 = new Circle3(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());
        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());
        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());
        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());
        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());
        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle3(5, 10, 200); // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());
        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());
    }
}