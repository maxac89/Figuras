package com.mycompany.formasoop;

public class Rectangle extends Shape{

    // Attributes
    private float base;
    private float height;

    // Constructors
    public Rectangle(){

    }

    public Rectangle(float base, float height){
        this.base = base;
        this.height = height;
    }

    public Rectangle(float base, float height, int x, int y){
        super(x, y);
        this.base = base;
        this.height = height;
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
        return base * height;
    }

    @Override
    float calculatePerimeter() {
        return 2 * (base + height);
    }
}
