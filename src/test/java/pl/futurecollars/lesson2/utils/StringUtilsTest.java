package pl.futurecollars.lesson2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.futurecollars.lesson2.utils.StringUtils;

class StringUtilsTest {

  @Test
  void shouldReturnReveredTest() {
    //given
    String value = "Test";

    //when
    char[] result = StringUtils.reverseString(value);

    //then
    char[] expectedResult = { 't', 's', 'e', 'T' };

    Assertions.assertArrayEquals(expectedResult, result);
  }

  @Test
  void shouldReturnReveredJava() {
    //given
    String value = "java";

    //when
    char[] result = StringUtils.reverseString(value);

    //then
    char[] expectedResult = { 'a', 'v', 'a', 'j' };

    Assertions.assertArrayEquals(expectedResult, result);
  }

}
