package pl.futurecollars.lesson2.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NumberValidatorTest {

  @Test
  void shouldReturnTrueIfNumberIsOdd() {
    //given
    int value = 1;

    //when
    boolean result = NumberValidator.isOdd(value);

    //then
    Assertions.assertTrue(result);
  }

  @Test
  void shouldReturnFalseIfNumberIsNotOdd() {
    //given
    int value = 2;

    //when
    boolean result = NumberValidator.isOdd(value);

    //then
    Assertions.assertFalse(result);
  }

  @Test
  void shouldReturnTrueIfNumberIsEven() {
    //given
    int value = 2;

    //when
    boolean result = NumberValidator.isEven(value);

    //then
    Assertions.assertTrue(result);
  }

  @Test
  void shouldReturnFalseIfNumberIsNotEven() {
    //given
    int value = 1;

    //when
    boolean result = NumberValidator.isEven(value);

    //then
    Assertions.assertFalse(result);
  }

}
