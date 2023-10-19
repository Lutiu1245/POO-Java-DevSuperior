public class Triangule {
    public double a;
    public double b;
    public double c;

    public void area() {
        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.printf("Area do triangulo: %.4f%n", area);
    }
}
