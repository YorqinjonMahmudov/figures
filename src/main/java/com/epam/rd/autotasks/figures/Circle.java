package com.epam.rd.autotasks.figures;


public class Circle extends Figure{

    private Point center;

    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle[" + pointsToString()+radius +']';
    }

    @Override
    public String pointsToString() {
        return (center.toString());
    }

    @Override
    public Point leftmostPoint() {
        return new Point(center.getX()-radius, center.getY()-radius);
    }
}

