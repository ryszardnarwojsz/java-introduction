package pl.futurecollars.cinema;

import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void shouldVerifySalaryAmountNotNull() {
        //given
        Employee employee = new Employee();
        // modify initialization or put your code here, if needed
        //when
        BigDecimal salary = employee.getBaseSalary();
        //then

        Assertions.assertNotNull(salary);
    }

    @Test
    void shouldVerifySalaryAmountHasDefaultValue() {
        //given
        Employee employee = new Employee();
        // modify initialization or put your code here, if needed
        //when
        BigDecimal salary = employee.getBaseSalary();
        //then

        Assertions.assertEquals(new BigDecimal(1500), salary);
    }

    @Test
    void shouldVerifySalaryAmountSetProperly() {
        //given
        Employee employee = new Employee();
        employee.setBaseSalary(new BigDecimal(100));
        // modify initialization or put your code here, if needed
        //when
        BigDecimal salary = employee.getBaseSalary();
        //then

        Assertions.assertEquals(new BigDecimal(100), salary);
    }

    @Test
    void shouldVerifyCalculatedEmployYearNotNull() {
        //given
        Employee employee = new Employee();
        // modify initialization or put your code here, if needed
        //when
        int employeeYears = employee.calculateEmployYears(2021);
        //then

        Assertions.assertNotNull(employeeYears);
    }

    @Test
    void shouldVerifyCalculatedEmployYearsIsCorrect() {
        //given
        Employee employee = new Employee();
        employee.setBaseSalary(new BigDecimal(100));
        // modify initialization or put your code here, if needed
        //when
        int employeeYears = employee.calculateEmployYears(2021);
        //then

        Assertions.assertEquals(employeeYears, 21);
    }

}