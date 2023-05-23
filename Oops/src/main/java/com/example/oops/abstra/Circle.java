package com.example.oops.abstra;


import static java.lang.Math.PI;

public class Circle extends Shape {
    private double radius;

    public Circle()
    {

    }

    public Circle(double radius)
    {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
