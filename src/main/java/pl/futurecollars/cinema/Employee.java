package pl.futurecollars.cinema;

import java.math.BigDecimal;

public class Employee extends BaseEmployee {


    public Employee() {
    }

    @Override
    public BigDecimal calculateMonthlySalary() {
        return  BigDecimal.ZERO;
    }
}
