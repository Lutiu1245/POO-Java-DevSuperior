package Default_methods;

import Default_methods.services.BrasilService;
import Default_methods.services.InterestService;
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
        InterestService brasilService = new BrasilService(2.0);
        InterestService usaService = new UsaService(1.0);
        double payment = brasilService.calculateInterest(amount, mounth);
        double payment2 = usaService.calculateInterest(amount, mounth);
    }
}
