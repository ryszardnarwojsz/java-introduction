package pl.futurecollars.lesson2.converter;

public class TextConverter {

  public static String convert(String value) {
    String[] splitString = value.split(" ");

    String result = "";
    for (int i = 0; i < splitString.length; i++) {
      if (i % 2 == 0) {
        result = result + splitString[i].toLowerCase();
      } else {
        result = result + splitString[i].toUpperCase();
      }
    }

    return result;
  }
}
