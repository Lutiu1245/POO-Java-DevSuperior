package Trabalhando_com_dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateH = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date data1 = date.parse("04/11/2000");
        Date data2 = dateH.parse("03/11/2010 12:59:59");
        System.out.println(dateH.format(data2));

    }
}
