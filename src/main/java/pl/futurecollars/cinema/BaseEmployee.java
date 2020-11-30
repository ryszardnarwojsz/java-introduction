package pl.futurecollars.cinema;

import java.math.BigDecimal;

public class BaseEmployee {

    public BaseEmployee() {
    }

    public BaseEmployee(final int employeeYear) {
    }

    public BigDecimal calculateMonthlySalary(){
        return BigDecimal.ZERO;
    }

    public BigDecimal getBaseSalary() {
        return  BigDecimal.ZERO;
    }

    public void setBaseSalary(BigDecimal baseSalary) {
    }

    public int calculateEmployYears(int currentYear) {
        return 0;
    }

    public static int getAmountOfEmployees(){
        return 0;
    }


}
