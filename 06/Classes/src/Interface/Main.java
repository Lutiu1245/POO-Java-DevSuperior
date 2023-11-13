package Interface;

import Interface.services.BraziltaxService;
import Interface.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Entre com a rental data: ");
        System.out.println("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.println("Entre com a data inicial (dd/MM/yyyy hh:ss)");
        Date start = sdf.parse(sc.nextLine());
        System.out.println("Entre com a data final: ");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.println("Entre com o preço da hora:");
        double pricePerHour = sc.nextDouble();
        System.out.println("Entre com o preço do dia");
        double pricePerDay = sc.nextDouble();
        RentalService rs = new RentalService(pricePerHour, pricePerDay, new BraziltaxService());
        rs.processInvoice(cr);


        sc.close();
    }
}
