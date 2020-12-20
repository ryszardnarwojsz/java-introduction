package pl.futurecollars.cinema;

import java.math.BigDecimal;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Task2Test {

    @Test
    void shouldVerifyManagerSalaryIsNotNull() {
        //given
        Manager manager = new Manager();
        // modify initialization or put your code here, if needed, if needed
        //when
        BigDecimal salary = manager.calculateMonthlySalary();
        //then
        Assertions.assertNotNull(salary);
    }

    @Test
    void shouldVerifyManagerSalaryCalculatedProperly_1() {
        //given
        Manager manager = new Manager();
        // modify initialization or put your code here, if needed
        //when
        BigDecimal salary = manager.calculateMonthlySalary();
        //then
        Assertions.assertEquals(new BigDecimal(5500), salary);
    }

    @Test
    void shouldVerifyManagerSalaryCalculatedProperly_2() {
        //given
        Manager manager = new Manager();
        manager.setBonus(new BigDecimal(600));
        // modify initialization or put your code here, if needed
        //when
        BigDecimal salary = manager.calculateMonthlySalary();
        //then
        Assertions.assertEquals(new BigDecimal(5600), salary);
    }

    @Test
    void shouldVerifyEmployeeSalaryIsNotNull() {
        //given
        Employee employee = new Employee();
        // modify initialization or put your code here, if needed
        //when
        BigDecimal salary = employee.calculateMonthlySalary();
        //then
        Assertions.assertNotNull(salary);
    }

    @Test
    void shouldVerifyEmployeeSalaryCalculatedProperly_1() {
        //given
        Employee employee = new Employee();
        // modify initialization or put your code here, if needed
        //when
        BigDecimal salary = employee.calculateMonthlySalary();
        //then
        Assertions.assertEquals(new BigDecimal(1500), salary);
    }

}