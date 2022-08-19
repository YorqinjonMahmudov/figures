package com.epam.rd.autotasks.figures;


public class Quadrilateral extends Figure {

    private Point first;

    private Point second;

    private Point third;

    private Point fourth;

    public Quadrilateral(Point first, Point second, Point third, Point fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }

    @Override
    public double area() {

        Triangle firstTriangle = new Triangle(first, second, fourth);
        Triangle secondTriangle = new Triangle(second, third, fourth);
        return firstTriangle.area() + secondTriangle.area();

    }

    @Override
    public String pointsToString() {
        return first.toString()+
                second.toString()+
                third.toString()+
                fourth.toString();
    }

    @Override
    public Point leftmostPoint() {
        double min = Math.min(first.getX(), Math.min(second.getX(), Math.min(third.getX(), fourth.getX())));
        if (min == first.getX())
            return first;
        else if (min == second.getX())
            return second;
        else if (min == third.getX())
            return third;
        else
            return fourth;
    }

    @Override
    public String toString() {
        return "Quadrilateral[" +
                pointsToString()+
                ']';
    }
}

