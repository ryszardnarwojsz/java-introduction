package pl.futurecollars.lesson2.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TextConverterTest {

  @Test
  void shouldConvertText() {
    //given
    String text = "Another lesson of Java project";

    //when
    String result = TextConverter.convert(text);

    //then
    Assertions.assertEquals("anotherLESSONofJAVAproject", result);
  }

}
