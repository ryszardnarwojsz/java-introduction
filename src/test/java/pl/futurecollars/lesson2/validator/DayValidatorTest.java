package pl.futurecollars.lesson2.validator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DayValidatorTest {

  @Test
  void shouldReturnMondayWhenItIs1() {
    //given
    int dayNumber = 1;

    //when
    String dayOfWeek = DayValidator.printDayOfWeek(dayNumber);

    //then
    Assertions.assertEquals("Monday", dayOfWeek);
  }

  @Test
  void shouldReturnFridayWhenItIs5() {
    //given
    int dayNumber = 5;

    //when
    String dayOfWeek = DayValidator.printDayOfWeek(dayNumber);

    //then
    Assertions.assertEquals("Friday", dayOfWeek);
  }

  @Test
  void shouldReturnWeekendWhenItIs6() {
    //given
    int dayNumber = 6;

    //when
    String dayOfWeek = DayValidator.printDayOfWeek(dayNumber);

    //then
    Assertions.assertEquals("Weekend", dayOfWeek);
  }

  @Test
  void shouldReturnErrorMessageWhenNumberIsHigherThen7() {
    //given
    int dayNumber = 8;

    //when
    String errorMessage = DayValidator.printDayOfWeek(dayNumber);

    //then
    Assertions.assertEquals("There is no such a day!", errorMessage);
  }

}
