package exercicio_contratos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String Name;
    private WorkLevel level;
    private double baseSalary;
    private Department department;

    List<HourContract> contractList = new ArrayList<>();
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public WorkLevel getLevel() {
        return level;
    }

    public void setLevel(WorkLevel level) {
        this.level = level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Worker(String name, WorkLevel level, double baseSalary, Department department) {
        Name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }
    public List<HourContract> getContract() {
        return contractList;
    }
    public void addContract(HourContract contract) {
        contractList.add(contract);
    }
    public void removeContract(HourContract contract) {
        contractList.remove(contract);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double income(Integer year, Integer month) {
        double sum = baseSalary;
        Calendar calendar = Calendar.getInstance();
        for (HourContract c :
                contractList) {
            calendar.setTime(c.getDate());
            int calendar_year = calendar.get(Calendar.YEAR);
            // pelo que entendi o primeiro mês do ano (Janeiro) começa com o valor de 0, ent por isso o "1+"
            int calendar_mounth = 1 + calendar.get(Calendar.MONTH);
            if (year == calendar_year && month == calendar_mounth) {
                sum += c.totalValue();
            }
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "Name='" + Name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
