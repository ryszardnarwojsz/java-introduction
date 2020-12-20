package pl.futurecollars.cinema;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task3Tests {


    @Test
    void shouldVerifyAmountOfEmployeesCalculatedProperly() {
        //given
        int amountOfEmployeesOnStart = BaseEmployee.getAmountOfEmployees();
        Employee employee = new Employee();
        Manager manager = new Manager();
        // when
        int amountOfEmployees = BaseEmployee.getAmountOfEmployees();
        //them
        Assertions.assertEquals(amountOfEmployeesOnStart + 2, amountOfEmployees);
    }
}
