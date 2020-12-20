package pl.futurecollars.cinema;

import java.math.BigDecimal;

public class Manager extends BaseEmployee {


    public Manager() {
    }

    @Override
    public BigDecimal calculateMonthlySalary() {
        return BigDecimal.ZERO;
    }


    public void setBonus(BigDecimal bonus) {
    }
}
