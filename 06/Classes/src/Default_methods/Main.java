package Default_methods;

import Default_methods.services.BrasilService;
import Default_methods.services.UsaService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados: ");
        double amount = sc.nextDouble();
        int mounth = sc.nextInt();
        BrasilService brasilService = new BrasilService(2.0);
        UsaService usaService = new UsaService(1.0);
        double payment = brasilService.calculateInterest(amount, mounth);
        double payment2 = usaService.calculeInterest(amount, mounth);
    }
}
