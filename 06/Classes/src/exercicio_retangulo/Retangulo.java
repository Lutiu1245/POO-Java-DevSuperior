package exercicio_retangulo;

public class Retangulo {
    public double width;
    public double heigth;

    public double Area() {
        return width * heigth;
    }

    public double Perimetro() {
        return 2 * (width + heigth);
    }

    public double Diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(heigth, 2));
    }

    public String toString() {
        return "Area: " + Area() + "\nPerimetro: " + Perimetro() + "\nDiagonal: " + Diagonal();
    }
}
