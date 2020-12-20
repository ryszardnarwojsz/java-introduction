package pl.futurecollars.lesson2.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

  @Test
  void shouldAddTwoValues1and1Return2() {
    //given
    int value1 = 1;
    int value2 = 1;

    //when
    int result = Calculator.sum(value1, value2);

    //then
    Assertions.assertEquals(2, result);
  }

  @Test
  void shouldAddTwoValues1and2Return3() {
    //given
    int value1 = 1;
    int value2 = 2;

    //when
    int result = Calculator.sum(value1, value2);

    //then
    Assertions.assertEquals(3, result);
  }

  @Test
  void shouldSubtractTwoValues1and1Return0() {
    //given
    int value1 = 1;
    int value2 = 1;

    //when
    int result = Calculator.subtract(value1, value2);

    //then
    Assertions.assertEquals(0, result);
  }

  @Test
  void shouldSubtractTwoValues2and1Return1() {
    //given
    int value1 = 2;
    int value2 = 1;

    //when
    int result = Calculator.subtract(value1, value2);

    //then
    Assertions.assertEquals(1, result);
  }

  @Test
  void shouldMultiplyTwoValues1and0Return0() {
    //given
    int value1 = 1;
    int value2 = 0;

    //when
    int result = Calculator.multiply(value1, value2);

    //then
    Assertions.assertEquals(0, result);
  }

  @Test
  void shouldMultiplyTwoValues2and2Return4() {
    //given
    int value1 = 2;
    int value2 = 2;

    //when
    int result = Calculator.multiply(value1, value2);

    //then
    Assertions.assertEquals(4, result);
  }

  @Test
  void shouldDivisionTwoValues4and2Return2() {
    //given
    int value1 = 4;
    int value2 = 2;

    //when
    int result = Calculator.division(value1, value2);

    //then
    Assertions.assertEquals(2, result);
  }

  @Test
  void shouldDivisionTwoValues3and3Return1() {
    //given
    int value1 = 3;
    int value2 = 3;

    //when
    int result = Calculator.division(value1, value2);

    //then
    Assertions.assertEquals(1, result);
  }

}
