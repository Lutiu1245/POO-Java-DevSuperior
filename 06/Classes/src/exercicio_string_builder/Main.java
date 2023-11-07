package exercicio_string_builder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com o data do Post: ");
        Date data = dateFormat.parse(sc.nextLine());
        System.out.println("Entre com o titulo do Post: ");
        String title = sc.nextLine();
        System.out.println("Entre com o conteudo do Post: ");
        String cotent = sc.nextLine();
        System.out.println("Entre com a quantidade de likes do post: ");
        int likes = sc.nextInt();
        System.out.println("Quantos comentarios tem no post?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {

        }
        System.out.println("Entre com os comentarios do post: ");
        sc.nextLine();
        String comentario = sc.nextLine();
        Comment comment = new Comment(comentario);
        Post post = new Post(data, title, cotent, likes, comment);
        System.out.println(post.getTitle());
        System.out.println(post.getLikes() + " Likes " + post.getMoment());
        System.out.println("Comments:");
        System.out.println(post.getComment().getText());
    }
}
