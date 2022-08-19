package com.epam.rd.autotasks.figures;


import static java.lang.Math.abs;

public class Triangle extends Figure {

    private Point first;

    private Point second;

    private Point third;

    public Triangle(Point parameter1, Point parameter2, Point parameter3) {
        this.first = parameter1;
        this.second = parameter2;
        this.third = parameter3;
    }


    @Override
    public double area() {

        double x1 = first.getX();
        double x2 = second.getX();
        double x3 = third.getX();
        double y1 = first.getY();
        double y2 = second.getY();
        double y3 = third.getY();
        return abs((x2-x1)*(y3-y1) - (x3-x1)*(y2-y1))/2;



    }

    @Override
    public String pointsToString() {
        return first.toString() +
                second.toString() +
                third.toString();
    }

    @Override
    public Point leftmostPoint() {
        double min = Math.min(first.getX(), Math.min(second.getX(), third.getX()));
        if (min == first.getX())
            return first;
        else if (min == second.getX())
            return second;
        else
            return third;
    }


    @Override
    public String toString() {
        return "Triangle[" + pointsToString() + "]";
    }
}

