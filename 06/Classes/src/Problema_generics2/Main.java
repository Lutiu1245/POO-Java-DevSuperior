package Problema_generics2;

import Problema_generics2.Entities.Produtos;
import Problema_generics2.Services.CalculeServices;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produtos> lista = new ArrayList<>();
        String path = "C:\\Produtos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {
                String[] fildes = line.split(",");
                lista.add(new Produtos(fildes[0], Double.parseDouble(fildes[1])));
                line = br.readLine();
            }
            Produtos x = CalculeServices.max(lista);
            System.out.println("Max: ");
            System.out.println(x);
        } catch (IOException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
