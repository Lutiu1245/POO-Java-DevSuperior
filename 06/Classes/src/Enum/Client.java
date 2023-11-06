package Enum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
    private String name;
    private String email;
    private Date Aniversario;

    public Client(String name, String email, Date Aniversario) {
        this.name = name;
        this.email = email;
        this.Aniversario = Aniversario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Aniversario=" + Aniversario +
                '}';
    }
}
