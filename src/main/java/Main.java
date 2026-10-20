void main() {
    Scanner sc = new Scanner(System.in);

    // Triángulo
    System.out.println("Ingrese la base del triángulo:");
    float trianglebase = sc.nextFloat();

    System.out.println("Ingrese la altura del triángulo:");
    float triangleheight = sc.nextFloat();

    Triangle triangle1;
    triangle1 = new Triangle(trianglebase, triangleheight, 4, 5);

    System.out.println("El area del triángulo es " + triangle1.calculateArea());
    System.out.println("El perimetro del triángulo es " + triangle1.calculatePerimeter());
    System.out.println("Las coordenadas del triángulo son " + triangle1.getCoordinate());

    // Rectángulo
    System.out.println("Ingrese la base del rectángulo:");
    float rectanglebase = sc.nextFloat();

    System.out.println("Ingrese la altura del rectángulo:");
    float rectangleheight = sc.nextFloat();

    Rectangle rectangle1;
    rectangle1 = new Rectangle(rectanglebase, rectangleheight, 6, 7);

    System.out.println("El area del rectángulo es " + rectangle1.calculateArea());
    System.out.println("El perimetro del rectángulo es " + rectangle1.calculatePerimeter());
    System.out.println("Las coordenadas del rectángulo son " + rectangle1.getCoordinate());

    // Círculo
    System.out.println("Ingrese el radio del círculo:");
    float circleradius = sc.nextFloat();

    Circle circle1;
    circle1 = new Circle(circleradius, 8, 9);

    System.out.println("El area del círculo es " + circle1.calculateArea());
    System.out.println("El perimetro del círculo es " + circle1.calculatePerimeter());
    System.out.println("Las coordenadas del círculo son " + circle1.getCoordinate());
}