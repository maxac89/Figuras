package com.mycompany.formasoop;

public class Shape {
    private Coordinate coordinate;

    public Shape() {
    }

    public Shape(int x, int y) {
        this.coordinate = new Coordinate(x, y);
    }

    public String getCoordinate() {
        return coordinate.getXAndY();
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    float calculateArea() {
        return 0;
    }

    float calculatePerimeter() {
        return 0;
    }
}
