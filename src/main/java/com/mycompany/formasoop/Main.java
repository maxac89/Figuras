package com.mycompany.formasoop;

public class Main {

    public static void main(String[] args) {

        // Triángulo
        Triangle triangle1;
        triangle1 = new Triangle(12, 7, 4, 5);

        System.out.println("El area del triángulo es " + triangle1.calculateArea());
        System.out.println("El perimetro del triángulo es " + triangle1.calculatePerimeter());
        System.out.println("Las coordenadas del triángulo son " + triangle1.getCoordinate());

        // Rectángulo
        Rectangle rectangle1;
        rectangle1 = new Rectangle(10, 15, 6, 7);

        System.out.println("El area del rectángulo es " + rectangle1.calculateArea());
        System.out.println("El perimetro del rectángulo es " + rectangle1.calculatePerimeter());
        System.out.println("Las coordenadas del rectángulo son " + rectangle1.getCoordinate());

        // Círculo
        Circle circle1;
        circle1 = new Circle(10, 8, 9);

        System.out.println("El area del círculo es " + circle1.calculateArea());
        System.out.println("El perimetro del círculo es " + circle1.calculatePerimeter());
        System.out.println("Las coordenadas del círculo son " + circle1.getCoordinate());
    }
}