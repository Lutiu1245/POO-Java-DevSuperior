package BarOO;

public class Bar {
    public char sexo;
    public int cerveja;
    public int espetinho;
    public int refri;

    public double cover() {
        if (sexo == 'M') {
            return 10.0;
        }
        return 8.0;
    }
    public double feeding() {
        return espetinho * 7.0;
    }

    public double ticket() {
        return cerveja * 5.0 + refri * 3.0;
    }

    public double total() {
        return cover() + feeding() + ticket();
    }
}
