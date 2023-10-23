package BarOO;

public class Main {
    public static void main(String[] args) {
        Bar bar = new Bar();
        bar.sexo = 'M';
        bar.cerveja = 7;
        bar.espetinho = 2;
        bar.refri = 1;
        System.out.println(bar.total());
    }
}
