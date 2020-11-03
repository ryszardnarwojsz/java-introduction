package pl.futurecollars.lesson2.utils;

public class StringUtils {

  public static char[] reverseString(String value) {
    char[] chars = value.toCharArray();
    char[] result = new char[chars.length];

    int resultIndex = 0;
    for (int i = chars.length; i > 0; i--) {
      result[resultIndex] = chars[i - 1];
      resultIndex++;
    }

    return result;
  }

}
