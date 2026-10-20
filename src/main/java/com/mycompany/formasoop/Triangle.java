package com.mycompany.formasoop;

public class Triangle extends Shape{

    // Attributes
    private float base;
    private float height;

    // Constructors
    public Triangle() {

    }

    public Triangle(float base, float height){
        this.base = base;
        this.height = height;
    }

    public Triangle(float base, float height, int x, int y){
        this.base = base;
        this.height = height;
        super(x, y);
    }

    // Setters and getters
    public float getBase(){
        return this.base;
    }

    public void setBase(float base){
        this.base = base;
    }

    public float getHeight(){
        return this.height;
    }

    public void setHeight(float height){
        this.height = height;
    }

    // Other methods
    @Override
    float calculateArea() {
        return (this.base * this.height) / 2;
    }

    @Override
    float calculatePerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(this.base, 2)
                + Math.pow(this.height, 2));
        return (this.base + this.height + (float) hypotenuse);
    }
}
