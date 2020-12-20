package pl.futurecollars.lesson2.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AgeValidatorTest {

  @Test
  void shouldReturnTrueIfAgeIsEqualTo18() {
    //given
    int age = 18;

    //when
    boolean result = AgeValidator.isAdult(age);

    //then
    assertTrue(result);
  }

  @Test
  void shouldReturnTrueIfAgeIsHigherThen18() {
    //given
    int age = 25;

    //when
    boolean result = AgeValidator.isAdult(age);

    //then
    assertTrue(result);
  }

  @Test
  void shouldReturnFalseIfAgeIsLowerThen18() {
    //given
    int age = 15;

    //when
    boolean result = AgeValidator.isAdult(age);

    //then
    assertFalse(result);
  }

}
