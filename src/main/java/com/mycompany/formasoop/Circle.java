package com.mycompany.formasoop;

public class Circle extends Shape{

    // Attributes
    private float radius;

    // Constructors
    public Circle(){

    }

    public Circle(float radius){
        this.radius = radius;
    }

    public Circle(float radius, int x, int y){
        this.radius = radius;
        super(x, y);
    }

    // Setters and getters
    public float getRadius(){
        return this.radius;
    }

    public void setRadius(float radius){
        this.radius = radius;
    }

    // Other methods
    @Override
    float calculateArea(){
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    @Override
    float calculatePerimeter(){
        return (float) (2 * Math.PI * radius);
    }
}
