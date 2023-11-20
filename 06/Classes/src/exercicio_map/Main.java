package exercicio_map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o caminho do arquivo: ");
        String path = sc.nextLine();
        Map<String, Integer> votos = new HashMap<>();
        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int voto = Integer.parseInt(fields[1]);

                if (votos.containsKey(name)){
                    // pega o valor da chave.
                    int lengthVotes = votos.get(name);
                    // soma o valor da chave com o valor recebido no doc.
                    int sum = voto + lengthVotes;
                    votos.put(name, voto + sum);
                }
                    votos.put(name, voto);
                line = br.readLine();
            }
            for (String key : votos.keySet()) {
                System.out.println(key + ": " + votos.get(key));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
